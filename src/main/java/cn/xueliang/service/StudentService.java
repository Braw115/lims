package cn.xueliang.service;

import cn.xueliang.pojo.Student;
import cn.xueliang.utils.EasyUIDataGridResult;

public interface StudentService {
	//���ѧ���û�
	int addStudent(Student student);
	//ɾ��ѧ���û�
	int delStudent(String sid);
	//�޸�ѧ���û���Ϣ
	int updateStudent(Student student);
	//����sid��ѯѧ����Ϣ
	Student SelectStudentBySid(String sid);
	//��ҳ��ѯ
	EasyUIDataGridResult getStudentList(int page,int rows);
}
