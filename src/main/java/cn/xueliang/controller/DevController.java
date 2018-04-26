package cn.xueliang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xueliang.pojo.Dev;
import cn.xueliang.service.DevService;
import cn.xueliang.utils.EasyUIDataGridResult;

@Controller
@RequestMapping("/dev")
public class DevController {
	@Autowired
	private DevService devService;
	
	//�õ������豸
	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDataGridResult getDevList(Integer page,Integer rows){
		EasyUIDataGridResult result = devService.findAllDev(page,rows);
		return result;
	}
	
	//����豸
	@RequestMapping("/addDev")
	@ResponseBody
	public int addDev(Dev dev){
		int result = devService.addDev(dev);
		return result;
	}
	
	//ɾ���豸
	@RequestMapping("/delDev")
	@ResponseBody
	public int delDev(String devNum){
		int result = devService.delDev(devNum);
		return result;
	}
	
	//�����豸
	@RequestMapping("/updateDev")
	@ResponseBody
	public int updateDev(Dev dev){
		int result = devService.updateDev(dev);
		return result;
	}
}
