package cn.xueliang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.xueliang.mapper.CourseMapper;
import cn.xueliang.pojo.Course;
import cn.xueliang.pojo.CourseExample;
import cn.xueliang.pojo.CourseExample.Criteria;
import cn.xueliang.service.CourseService;
import cn.xueliang.utils.EasyUIDataGridResult;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseMapper courseMapper;

	@Override
	public int addCourse(Course course) {
		int result = courseMapper.insert(course);
		return result;
	}

	@Override
	public int delCourse(String cid) {
		int result = courseMapper.deleteByPrimaryKey(cid);
		return result;
	}

	@Override
	public int updateCourse(Course course) {
		int result = courseMapper.updateByPrimaryKey(course);
		return result;
	}

	// ���ݿ���ʵ���ҷ�ҳ��ѯ
	@Override
	public EasyUIDataGridResult findTechnology(int page, int rows) {

		// ��ҳ����
		PageHelper.startPage(page, rows);
		// ִ�в�ѯ
		CourseExample example = new CourseExample();
		Criteria criteria = example.createCriteria();
		criteria.andCdeptEqualTo("��ý��γ�");
		List<Course> list = courseMapper.selectByExample(example);
		// ȡ��ҳ��Ϣ
		PageInfo<Course> pageInfo = new PageInfo<Course>(list);
		// ����EasyUIDataGridResult����
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

	@Override
	public EasyUIDataGridResult findPhysics(int page, int rows) {
		// ��ҳ����
		PageHelper.startPage(page, rows);
		// ִ�в�ѯ
		CourseExample example = new CourseExample();
		Criteria criteria = example.createCriteria();
		criteria.andCdeptEqualTo("����ʵ��γ�");
		List<Course> list = courseMapper.selectByExample(example);
		// ȡ��ҳ��Ϣ
		PageInfo<Course> pageInfo = new PageInfo<Course>(list);
		// ����EasyUIDataGridResult����
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

	@Override
	public EasyUIDataGridResult findChemistry(int page, int rows) {
		// ��ҳ����
		PageHelper.startPage(page, rows);
		// ִ�в�ѯ
		CourseExample example = new CourseExample();
		Criteria criteria = example.createCriteria();
		criteria.andCdeptEqualTo("��ѧʵ��γ�");
		List<Course> list = courseMapper.selectByExample(example);
		// ȡ��ҳ��Ϣ
		PageInfo<Course> pageInfo = new PageInfo<Course>(list);
		// ����EasyUIDataGridResult����
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

	@Override
	public EasyUIDataGridResult findBiology(int page, int rows) {
		// ��ҳ����
		PageHelper.startPage(page, rows);
		// ִ�в�ѯ
		CourseExample example = new CourseExample();
		Criteria criteria = example.createCriteria();
		criteria.andCdeptEqualTo("����ʵ��γ�");
		List<Course> list = courseMapper.selectByExample(example);
		// ȡ��ҳ��Ϣ
		PageInfo<Course> pageInfo = new PageInfo<Course>(list);
		// ����EasyUIDataGridResult����
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

	@Override
	public EasyUIDataGridResult findMedicine(int page, int rows) {
		// ��ҳ����
		PageHelper.startPage(page, rows);
		// ִ�в�ѯ
		CourseExample example = new CourseExample();
		Criteria criteria = example.createCriteria();
		criteria.andCdeptEqualTo("ҽѧʵ��γ�");
		List<Course> list = courseMapper.selectByExample(example);
		// ȡ��ҳ��Ϣ
		PageInfo<Course> pageInfo = new PageInfo<Course>(list);
		// ����EasyUIDataGridResult����
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

}
