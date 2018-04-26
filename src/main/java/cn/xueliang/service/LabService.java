package cn.xueliang.service;

import cn.xueliang.pojo.Lab;
import cn.xueliang.utils.EasyUIDataGridResult;

public interface LabService {
	EasyUIDataGridResult findAllLab(int page,int rows);
	int addLab(Lab lab);
	int delLab(String labNum);
	int updateLab(Lab lab);
}
