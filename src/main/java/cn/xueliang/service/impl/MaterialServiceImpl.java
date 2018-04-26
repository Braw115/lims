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

	// ����(�õ�)���кĲ�
	@Override
	public EasyUIDataGridResult findAllMat(int page, int rows) {
		// ��ҳ����
		PageHelper.startPage(page, rows);
		// ִ�в�ѯ
		MaterialExample example = new MaterialExample();
		List<Material> list = materialMapper.selectByExample(example);
		// ȡ��ҳ��Ϣ
		PageInfo<Material> pageInfo = new PageInfo<Material>(list);
		// ����EasyUIDataGridResult����
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

	// ��ӺĲ�
	@Override
	public int addMat(Material mat) {
		int result = materialMapper.insert(mat);
		return result;
	}

	// ɾ���Ĳ�
	@Override
	public int delMat(String matNum) {
		int result = materialMapper.deleteByPrimaryKey(matNum);
		return result;
	}

	// ���ºĲ�
	@Override
	public int updateMat(Material mat) {
		int result = materialMapper.updateByPrimaryKey(mat);
		return result;
	}

}
