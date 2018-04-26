package cn.xueliang.service;

import cn.xueliang.pojo.Dev;
import cn.xueliang.utils.EasyUIDataGridResult;



public interface DevService {
	EasyUIDataGridResult findAllDev(int page,int rows);
	int addDev(Dev dev);
	int delDev(String devNum);
	int updateDev(Dev dev);
}
