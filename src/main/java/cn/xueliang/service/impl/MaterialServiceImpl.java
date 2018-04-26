package cn.xueliang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.xueliang.mapper.MaterialMapper;
import cn.xueliang.pojo.Material;
import cn.xueliang.pojo.MaterialExample;
import cn.xueliang.pojo.Student;
import cn.xueliang.service.MaterialService;
import cn.xueliang.utils.EasyUIDataGridResult;

@Service
public class MaterialServiceImpl implements MaterialService {
	@Autowired
	private MaterialMapper materialMapper;

	// 加载(得到)所有耗材
	@Override
	public EasyUIDataGridResult findAllMat(int page, int rows) {
		// 分页处理
		PageHelper.startPage(page, rows);
		// 执行查询
		MaterialExample example = new MaterialExample();
		List<Material> list = materialMapper.selectByExample(example);
		// 取分页信息
		PageInfo<Material> pageInfo = new PageInfo<Material>(list);
		// 返回EasyUIDataGridResult对象
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

	// 添加耗材
	@Override
	public int addMat(Material mat) {
		int result = materialMapper.insert(mat);
		return result;
	}

	// 删除耗材
	@Override
	public int delMat(String matNum) {
		int result = materialMapper.deleteByPrimaryKey(matNum);
		return result;
	}

	// 更新耗材
	@Override
	public int updateMat(Material mat) {
		int result = materialMapper.updateByPrimaryKey(mat);
		return result;
	}

}
