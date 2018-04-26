package cn.xueliang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xueliang.pojo.Lab;
import cn.xueliang.service.LabService;
import cn.xueliang.utils.EasyUIDataGridResult;

@Controller
@RequestMapping("/lab")
public class LabController {
	@Autowired
	private LabService labService;
	
	//得到所有实验室
	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDataGridResult getLabList(Integer page,Integer rows){
		EasyUIDataGridResult result = labService.findAllLab(page,rows);
		return result;
	}
	
	//添加实验室
	@RequestMapping("/addLab")
	@ResponseBody
	public int addLab(Lab lab){
		int result = labService.addLab(lab);
		return result;
	}
	
	//删除实验室
	@RequestMapping("/delLab")
	@ResponseBody
	public int delLab(String labNum){
		int result = labService.delLab(labNum);
		return result;
	}
	//更新实验室
	@RequestMapping("/updateLab")
	@ResponseBody
	public int updateLab(Lab lab){
		int result = labService.updateLab(lab);
		return result;
	}
}
