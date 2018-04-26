package cn.xueliang.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspPartController {

	// 请求session中存的学生信息返回jsp片段
	@RequestMapping("/showStuInfo")
	public String showStuInfo(HttpServletRequest request) {

		return "showStuInfo";
	}

	// 返回学生管理的jsp片段
	@RequestMapping("/stuManage")
	public String stuManage() {
		return "stuManage";
	}

	// 返回实验室管理的jsp片段
	@RequestMapping("/labManage")
	public String labManage() {
		return "labManage";
	}

	// 返回设备管理的jsp片段
	@RequestMapping("/devManage")
	public String devManage() {
		return "devManage";
	}

	// 返回耗材管理的jsp片段
	@RequestMapping("/matManage")
	public String matManage() {
		return "matManage";
	}

	// 返回多媒体课程管理jsp片段
	@RequestMapping("/technologyCourse")
	public String technologyCourse() {
		return "technologyCourse";
	}

	// 返回物理课程管理jsp片段
	@RequestMapping("/physicsCourse")
	public String physicsCourse() {
		return "physicsCourse";
	}

	// 返回化学课程管理jsp片段
	@RequestMapping("/chemistryCourse")
	public String chemistryCourse() {
		return "chemistryCourse";
	}

	// 返回生物课程管理jsp片段
	@RequestMapping("/biologyCourse")
	public String biologyCourse() {
		return "biologyCourse";
	}

	// 返回医学课程管理jsp片段
	@RequestMapping("/medicineCourse")
	public String medicineCourse() {
		return "medicineCourse";
	}

	// 返回租借实验室信息jsp片段
	@RequestMapping("/hireLabInfo")
	public String hireLabInfo() {
		return "hireLabInfo";
	}

	// 返回租借设备信息jsp片段
	@RequestMapping("/hireDevInfo")
	public String hireDevInfo() {
		return "hireDevInfo";
	}

	// 返回租借耗材信息jsp片段
	@RequestMapping("/hireMatInfo")
	public String hireMatInfo() {
		return "hireMatInfo";
	}
	//返回发布公告jsp片段
	@RequestMapping("/notice")
	public String notice() {
		return "notice";
	}
	
}
