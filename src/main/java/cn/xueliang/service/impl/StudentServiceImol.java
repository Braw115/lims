package cn.xueliang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xueliang.mapper.StudentMapper;
import cn.xueliang.mapper.UserMapper;
import cn.xueliang.pojo.Student;
import cn.xueliang.pojo.StudentExample;
import cn.xueliang.pojo.User;
import cn.xueliang.service.StudentService;
import cn.xueliang.utils.EasyUIDataGridResult;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class StudentServiceImol implements StudentService {
	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private UserMapper userMapper;
	
	//���ѧ���û�
	@Override
	public int addStudent(Student student) {
		
		User user =new User();
		user.setUid(student.getSid());
		user.setPassword(student.getPassword());
		user.setRole(0);
		
		userMapper.insert(user);
		int result =studentMapper.insert(student);
		
		return result;
	}
	
	//ɾ��ѧ���û�
	@Override
	public int delStudent(String sid) {
		userMapper.deleteByPrimaryKey(sid);
		int result = studentMapper.deleteByPrimaryKey(sid);
		return result;
	}
	
	//�޸�ѧ���û���Ϣ
	@Override
	public int updateStudent(Student student) {
		int result = studentMapper.updateByPrimaryKey(student);
		return result;
	}
	
	//����sid��ѯѧ����Ϣ
	@Override
	public Student SelectStudentBySid(String sid) {
		Student student = studentMapper.selectByPrimaryKey(sid);
		return student;
	}

	@Override
	public EasyUIDataGridResult getStudentList(int page,int rows) {
		//��ҳ����
		PageHelper.startPage(page, rows);
		//ִ�в�ѯ
		StudentExample example =new StudentExample();
		List<Student> list = studentMapper.selectByExample(example);
		//ȡ��ҳ��Ϣ
		PageInfo<Student> pageInfo =new PageInfo<Student>(list); 
		//����EasyUIDataGridResult����
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}
	

}
