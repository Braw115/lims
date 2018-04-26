package cn.xueliang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xueliang.pojo.Student;
import cn.xueliang.service.StudentService;
import cn.xueliang.utils.EasyUIDataGridResult;
import cn.xueliang.utils.Result;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	//根据sid查询student
	@RequestMapping("/{sid}")
	@ResponseBody
	public Student findStudent(@PathVariable("sid") String sid) {
		Student student = studentService.SelectStudentBySid(sid);
		return student;
	}

	//添加学生用户
	@RequestMapping("/addStu")
	@ResponseBody
	public Result addStudent(Student student){
		try{
			studentService.addStudent(student);

		}catch(Exception e){
			return new Result("a","添加失败！");

		}
		return new Result("1","添加成功！");
	}

	//删除学生用户
	@RequestMapping("/delStu")
	public int delStudent(String sid){
		int result = studentService.delStudent(sid);
		return result;
	}

	//修改学生用户信息
	@RequestMapping("/updateStu")
	public int updateStudent(Student student){
		int result = studentService.updateStudent(student);
		return result;
	}
	//分页查询所有学生
	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDataGridResult getUserList(Integer page,Integer rows){
		EasyUIDataGridResult result = studentService.getStudentList(page, rows);
		return result;

	}
}
