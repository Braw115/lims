package cn.xueliang.controller;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.xueliang.utils.CaptchaUtil;

@Controller
public class CommonController {
	/**
	 * 显示首页
	 * @return
	 */
	@RequestMapping("/s_index")
	@ResponseBody
	public ModelAndView showSindex(){
		ModelAndView model = new ModelAndView();
		model.setViewName("s_index");
		return model;
	}
	
	@RequestMapping("/t_index")
	@ResponseBody
	public ModelAndView showTindex(){
		ModelAndView model = new ModelAndView();
		model.setViewName("t_index");
		return model;
	}
	/**
	 * 登录页面
	 * @return
	 */
	@RequestMapping("/login")
		@ResponseBody
		public ModelAndView doLogin(){
			ModelAndView model = new ModelAndView();
			model.setViewName("login");
			return model;
	}
	/**
	 * 生成验证码图片的Controller
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/createCode")
	public void createCode(HttpServletRequest request,HttpServletResponse response) throws IOException{  
	     //通知浏览器不要缓存  
	     response.setHeader("Expires","-1");//控制缓存的失效日期  
	     response.setHeader("Cache-Control","no-cache");//必须先与服务器确认返回的响应是否被更改，然后才能使用该响应来满足后续对同一个网址的请求  
	     response.setHeader("Pragma","-1");  
	     CaptchaUtil util=CaptchaUtil.Instance();  
	     // 将验证码输入到session中，用来验证    
	     String code=util.getString();  
	     request.getSession().setAttribute("code",code);  
	    // 输出到web页面    
	     ImageIO.write(util.getImage(), "jpg", response.getOutputStream());  
	 }
	
}
