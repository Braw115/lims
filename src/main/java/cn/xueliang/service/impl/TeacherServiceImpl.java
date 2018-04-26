package cn.xueliang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xueliang.mapper.TeacherMapper;
import cn.xueliang.pojo.Teacher;
import cn.xueliang.service.TeacherService;
@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	private TeacherMapper teacherMapper;

	@Override
	public Teacher selectTeacherByTid(String tid) {
		Teacher teacher =teacherMapper.selectByPrimaryKey(tid);
		return teacher;
	}
	
}
