package cn.xueliang.service;

import cn.xueliang.pojo.Course;
import cn.xueliang.utils.EasyUIDataGridResult;

public interface CourseService {
	//添加课程
	int  addCourse(Course course);
	//删除课程
	int delCourse(String cid);
	//更新课程
	int updateCourse(Course course);
	
	//根据开课实验室查询课程
	EasyUIDataGridResult findTechnology(int page,int rows);
	EasyUIDataGridResult findPhysics(int page,int rows);
	EasyUIDataGridResult findChemistry(int page,int rows);
	EasyUIDataGridResult findBiology(int page,int rows);
	EasyUIDataGridResult findMedicine(int page,int rows);
}
