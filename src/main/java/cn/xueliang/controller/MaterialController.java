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
	
	//得到所有耗材
	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDataGridResult getMaterialList(Integer page,Integer rows){
		EasyUIDataGridResult result = materialService.findAllMat(page,rows);
		return result;
	}
	
	//添加耗材
	@RequestMapping("/addMat")
	@ResponseBody
	public int addMat(Material mat){
		int result = materialService.addMat(mat);
		return result;
	}
	
	//删除耗材
	@RequestMapping("/delMat")
	@ResponseBody
	public int delMat(String matNum){
		int result = materialService.delMat(matNum);
		return result;
	}
	
	//更新耗材
		@RequestMapping("/updateMat")
		@ResponseBody
		public int updateMat (Material mat){
			int result = materialService.updateMat(mat);
			return result;
		}
}
