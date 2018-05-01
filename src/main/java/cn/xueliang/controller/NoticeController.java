package cn.xueliang.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
