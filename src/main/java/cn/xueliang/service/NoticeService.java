package cn.xueliang.service;

import java.util.List;

import cn.xueliang.pojo.Notice;

/**
 * ���洦��ӿ�
 * @author liuxueliang
 *
 */
public interface NoticeService {
	//��������
	public  int announce(Notice notice);
	//��ѯ����2������
	List<Notice> selectNewNotice();
}
