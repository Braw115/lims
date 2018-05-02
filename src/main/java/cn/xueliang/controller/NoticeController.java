package cn.xueliang.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.xueliang.pojo.Notice;
import cn.xueliang.service.NoticeService;
import cn.xueliang.utils.Result;

@Controller
@RequestMapping("/notice")
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	@RequestMapping("/announce")
	@ResponseBody
	public Result announce(Notice notice){
		notice.setAnnounceData(new Date());
		if(noticeService.announce(notice)==1){
			return new Result("ok","发布成功");
		}else{			
			return new Result("no","发布失败");
		}
	}
	@RequestMapping("/getNewNotice")
	@ResponseBody
	public ModelAndView getNewNotice(){
		List<Notice> noticeList = noticeService.selectNewNotice();
		ModelAndView model =new ModelAndView();
		model.addObject("noticeList",noticeList);
		model.setViewName("noticeInfo");
		return model;

	}
}
