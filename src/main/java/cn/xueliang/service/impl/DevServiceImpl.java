package cn.xueliang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.xueliang.mapper.DevMapper;
import cn.xueliang.pojo.Dev;
import cn.xueliang.pojo.DevExample;
import cn.xueliang.pojo.Lab;
import cn.xueliang.service.DevService;
import cn.xueliang.utils.EasyUIDataGridResult;

@Service
public class DevServiceImpl implements DevService {
	@Autowired
	private DevMapper devMapper;

	@Override
	public EasyUIDataGridResult findAllDev(int page, int rows) {
		// ��ҳ����
		PageHelper.startPage(page, rows);
		// ִ�в�ѯ
		DevExample example = new DevExample();
		List<Dev> list = devMapper.selectByExample(example);
		// ȡ��ҳ��Ϣ
		PageInfo<Dev> pageInfo = new PageInfo<Dev>(list);
		// ����EasyUIDataGridResult����
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

	@Override
	public int addDev(Dev dev) {
		int result = devMapper.insert(dev);
		return result;
	}

	@Override
	public int delDev(String devNum) {
		int result = devMapper.deleteByPrimaryKey(devNum);
		return result;
	}

	@Override
	public int updateDev(Dev dev) {
		int result = devMapper.updateByPrimaryKey(dev);
		return result;
	}

}
