package cn.xueliang.service;

import cn.xueliang.pojo.Teacher;

/**
 * ��teacher������Ľӿ�
 * @author liuxueliang
 *
 */
public interface TeacherService {
	/**
	 * ��tid��ѯ��ʦ
	 */
	public Teacher selectTeacherByTid(String tid);
}
