package cn.xueliang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xueliang.pojo.Course;
import cn.xueliang.service.CourseService;
import cn.xueliang.utils.EasyUIDataGridResult;

@Controller
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private CourseService courseService;

	@RequestMapping("/add")
	@ResponseBody
	public int addCourse(Course course) {
		int result = courseService.addCourse(course);
		return result;
	}

	@RequestMapping("/del")
	@ResponseBody
	public int delCourse(String cid) {
		int result = courseService.delCourse(cid);
		return result;
	}

	@RequestMapping("/update")
	@ResponseBody
	public int updateCourse(Course course) {
		int result = courseService.updateCourse(course);
		return result;
	}
	
	@RequestMapping("/technology")
	@ResponseBody
	public EasyUIDataGridResult technologyCourseList(Integer page,Integer rows){
		EasyUIDataGridResult result = courseService.findTechnology(page, rows);
		return result; 
	}
	
	@RequestMapping("/physics")
	@ResponseBody
	public EasyUIDataGridResult physicsCourseList(Integer page,Integer rows){
		EasyUIDataGridResult result = courseService.findPhysics(page, rows);
		return result; 
	}
	@RequestMapping("/chemistry")
	@ResponseBody
	public EasyUIDataGridResult chemistryCourseList(Integer page,Integer rows){
		EasyUIDataGridResult result = courseService.findChemistry(page, rows);
		return result; 
	}
	@RequestMapping("/biology")
	@ResponseBody
	public EasyUIDataGridResult biologyCourseList(Integer page,Integer rows){
		EasyUIDataGridResult result = courseService.findBiology(page, rows);
		return result; 
	}
	@RequestMapping("/medicine")
	@ResponseBody
	public EasyUIDataGridResult medicineCourseList(Integer page,Integer rows){
		EasyUIDataGridResult result = courseService.findMedicine(page, rows);
		return result; 
	}

}
