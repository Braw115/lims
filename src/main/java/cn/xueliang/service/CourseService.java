package cn.xueliang.service;

import cn.xueliang.pojo.Course;
import cn.xueliang.utils.EasyUIDataGridResult;

public interface CourseService {
	//��ӿγ�
	int  addCourse(Course course);
	//ɾ���γ�
	int delCourse(String cid);
	//���¿γ�
	int updateCourse(Course course);
	
	//���ݿ���ʵ���Ҳ�ѯ�γ�
	EasyUIDataGridResult findTechnology(int page,int rows);
	EasyUIDataGridResult findPhysics(int page,int rows);
	EasyUIDataGridResult findChemistry(int page,int rows);
	EasyUIDataGridResult findBiology(int page,int rows);
	EasyUIDataGridResult findMedicine(int page,int rows);
}
