package cn.xueliang.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xueliang.pojo.Student;
import cn.xueliang.pojo.Teacher;
import cn.xueliang.pojo.User;
import cn.xueliang.service.StudentService;
import cn.xueliang.service.TeacherService;
import cn.xueliang.service.UserService;
import cn.xueliang.utils.CustomizedToken;
import cn.xueliang.utils.Result;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private TeacherService teacherService;
	
	/**
	 * 登录验证
	 * @param user
	 * @param checkCode
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/dologin")
	@ResponseBody
	public Result UserLogin(User user, String checkCode,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		String uid = user.getUid();
		String password = user.getPassword();
		Integer role = user.getRole();
		System.out.println(uid+"------"+password+"----"+role);
		//创建token对象和subject对象
		//UsernamePasswordToken token =new UsernamePasswordToken(uid.trim(), password);
		CustomizedToken token = new CustomizedToken(uid, password,role );
		Subject subject = SecurityUtils.getSubject();
		
		//获得session中存的验证码
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(30 * 60);
		String sessionCode = (String) session.getAttribute("code");
		
		//验证验证码及用户信息
		if (sessionCode.equalsIgnoreCase(checkCode)) {
			System.out.println("验证码正确");
			System.out.println(subject.getSession().getAttribute("code"));
			try{
				subject.login(token);
				if(role==0){
					Student student =studentService.SelectStudentBySid(uid);
					session.setAttribute("student", student);
				}else{
					Teacher teacher = teacherService.selectTeacherByTid(uid);
					session.setAttribute("teacher", teacher);
				}
				
				
			}catch (UnknownAccountException e) {
				return new Result("403", "用户名不存在");
				
			}catch(IncorrectCredentialsException e) {
				return new Result("403", "密码不正确");
			}
			if(subject.hasRole("student")){
				System.out.println("学生身份登陆成功");
				//学生身份登录
				return new Result( "0","登录成功");
			}else{
				//教师身份登陆
				System.out.println("老师身份登陆成功");
				return new Result( "1","登录成功");
			}
		} else {
			return new Result("2", "验证码错误！");
		}

	}
	
	/**
	 * 注销
	 * @param session
	 * @return
	 */
	@RequestMapping("logout")
	public String teacherLogout(HttpSession session) {
		session.invalidate();
		return "login";
	}
}
