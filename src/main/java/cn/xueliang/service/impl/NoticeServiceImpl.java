package cn.xueliang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xueliang.mapper.NoticeMapper;
import cn.xueliang.pojo.Notice;
import cn.xueliang.service.NoticeService;
@Service
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	private NoticeMapper noticeMapper;
	@Override
	//发布(添加)公告
	public int announce(Notice notice) {
		int result = noticeMapper.insert(notice);
		return result;
	}
	//查询最新2条公告
	@Override
	public List<Notice> selectNewNotice() {
		List<Notice> noticeList =  noticeMapper.selectNewNotice();
		return noticeList;
	}

}
