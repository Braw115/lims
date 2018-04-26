package cn.xueliang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.xueliang.mapper.LabMapper;
import cn.xueliang.pojo.Lab;
import cn.xueliang.pojo.LabExample;
import cn.xueliang.pojo.Student;
import cn.xueliang.service.LabService;
import cn.xueliang.utils.EasyUIDataGridResult;

@Service
public class LabServiceImpl implements LabService {
	@Autowired
	private LabMapper labMapper;

	@Override
	public EasyUIDataGridResult findAllLab(int page, int rows) {
		// 分页处理
		PageHelper.startPage(page, rows);
		// 执行查询
		LabExample example = new LabExample();
		List<Lab> list = labMapper.selectByExample(example);
		// 取分页信息
		PageInfo<Lab> pageInfo = new PageInfo<Lab>(list);
		// 返回EasyUIDataGridResult对象
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

	// 添加实验室
	@Override
	public int addLab(Lab lab) {
		int result = labMapper.insert(lab);
		return result;
	}

	// 删除实验室
	@Override
	public int delLab(String labNum) {
		int result = labMapper.deleteByPrimaryKey(labNum);
		return result;
	}

	// 更新(修改)实验室信息
	@Override
	public int updateLab(Lab lab) {
		int result = labMapper.updateByPrimaryKey(lab);

		return result;
	}

}
