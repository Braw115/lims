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
	
	//添加学生用户
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
	
	//删除学生用户
	@Override
	public int delStudent(String sid) {
		userMapper.deleteByPrimaryKey(sid);
		int result = studentMapper.deleteByPrimaryKey(sid);
		return result;
	}
	
	//修改学生用户信息
	@Override
	public int updateStudent(Student student) {
		int result = studentMapper.updateByPrimaryKey(student);
		return result;
	}
	
	//根据sid查询学生信息
	@Override
	public Student SelectStudentBySid(String sid) {
		Student student = studentMapper.selectByPrimaryKey(sid);
		return student;
	}

	@Override
	public EasyUIDataGridResult getStudentList(int page,int rows) {
		//分页处理
		PageHelper.startPage(page, rows);
		//执行查询
		StudentExample example =new StudentExample();
		List<Student> list = studentMapper.selectByExample(example);
		//取分页信息
		PageInfo<Student> pageInfo =new PageInfo<Student>(list); 
		//返回EasyUIDataGridResult对象
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}
	

}
