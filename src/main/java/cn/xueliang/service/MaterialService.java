package cn.xueliang.service;

import cn.xueliang.pojo.Material;
import cn.xueliang.utils.EasyUIDataGridResult;


public interface MaterialService {
	EasyUIDataGridResult findAllMat(int page,int rows);
	int addMat(Material mat);
	int delMat(String matNum);
	int updateMat(Material mat);
}
