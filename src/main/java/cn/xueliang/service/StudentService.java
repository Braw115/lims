package cn.xueliang.service;

import cn.xueliang.pojo.Student;
import cn.xueliang.utils.EasyUIDataGridResult;

public interface StudentService {
	//添加学生用户
	int addStudent(Student student);
	//删除学生用户
	int delStudent(String sid);
	//修改学生用户信息
	int updateStudent(Student student);
	//根据sid查询学生信息
	Student SelectStudentBySid(String sid);
	//分页查询
	EasyUIDataGridResult getStudentList(int page,int rows);
}
