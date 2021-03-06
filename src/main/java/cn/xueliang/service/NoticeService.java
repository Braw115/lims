package cn.xueliang.service;

import java.util.List;

import cn.xueliang.pojo.Notice;

/**
 * 公告处理接口
 * @author liuxueliang
 *
 */
public interface NoticeService {
	//发布公告
	public  int announce(Notice notice);
	//查询最新2条公告
	List<Notice> selectNewNotice();
}
