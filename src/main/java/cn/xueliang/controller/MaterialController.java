package cn.xueliang.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xueliang.pojo.Material;
import cn.xueliang.service.MaterialService;
import cn.xueliang.utils.EasyUIDataGridResult;

@Controller
@RequestMapping("/mat")
public class MaterialController {
	@Autowired
	private MaterialService materialService;
	
	//�õ����кĲ�
	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDataGridResult getMaterialList(Integer page,Integer rows){
		EasyUIDataGridResult result = materialService.findAllMat(page,rows);
		return result;
	}
	
	//��ӺĲ�
	@RequestMapping("/addMat")
	@ResponseBody
	public int addMat(Material mat){
		int result = materialService.addMat(mat);
		return result;
	}
	
	//ɾ���Ĳ�
	@RequestMapping("/delMat")
	@ResponseBody
	public int delMat(String matNum){
		int result = materialService.delMat(matNum);
		return result;
	}
	
	//���ºĲ�
		@RequestMapping("/updateMat")
		@ResponseBody
		public int updateMat (Material mat){
			int result = materialService.updateMat(mat);
			return result;
		}
}
