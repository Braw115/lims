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

	// 根据开课实验室分页查询
	@Override
	public EasyUIDataGridResult findTechnology(int page, int rows) {

		// 分页处理
		PageHelper.startPage(page, rows);
		// 执行查询
		CourseExample example = new CourseExample();
		Criteria criteria = example.createCriteria();
		criteria.andCdeptEqualTo("多媒体课程");
		List<Course> list = courseMapper.selectByExample(example);
		// 取分页信息
		PageInfo<Course> pageInfo = new PageInfo<Course>(list);
		// 返回EasyUIDataGridResult对象
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

	@Override
	public EasyUIDataGridResult findPhysics(int page, int rows) {
		// 分页处理
		PageHelper.startPage(page, rows);
		// 执行查询
		CourseExample example = new CourseExample();
		Criteria criteria = example.createCriteria();
		criteria.andCdeptEqualTo("物理实验课程");
		List<Course> list = courseMapper.selectByExample(example);
		// 取分页信息
		PageInfo<Course> pageInfo = new PageInfo<Course>(list);
		// 返回EasyUIDataGridResult对象
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

	@Override
	public EasyUIDataGridResult findChemistry(int page, int rows) {
		// 分页处理
		PageHelper.startPage(page, rows);
		// 执行查询
		CourseExample example = new CourseExample();
		Criteria criteria = example.createCriteria();
		criteria.andCdeptEqualTo("化学实验课程");
		List<Course> list = courseMapper.selectByExample(example);
		// 取分页信息
		PageInfo<Course> pageInfo = new PageInfo<Course>(list);
		// 返回EasyUIDataGridResult对象
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

	@Override
	public EasyUIDataGridResult findBiology(int page, int rows) {
		// 分页处理
		PageHelper.startPage(page, rows);
		// 执行查询
		CourseExample example = new CourseExample();
		Criteria criteria = example.createCriteria();
		criteria.andCdeptEqualTo("生物实验课程");
		List<Course> list = courseMapper.selectByExample(example);
		// 取分页信息
		PageInfo<Course> pageInfo = new PageInfo<Course>(list);
		// 返回EasyUIDataGridResult对象
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

	@Override
	public EasyUIDataGridResult findMedicine(int page, int rows) {
		// 分页处理
		PageHelper.startPage(page, rows);
		// 执行查询
		CourseExample example = new CourseExample();
		Criteria criteria = example.createCriteria();
		criteria.andCdeptEqualTo("医学实验课程");
		List<Course> list = courseMapper.selectByExample(example);
		// 取分页信息
		PageInfo<Course> pageInfo = new PageInfo<Course>(list);
		// 返回EasyUIDataGridResult对象
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

}
