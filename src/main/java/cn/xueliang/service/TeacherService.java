package cn.xueliang.service;

import cn.xueliang.pojo.Teacher;

/**
 * 对teacher表操作的接口
 * @author liuxueliang
 *
 */
public interface TeacherService {
	/**
	 * 用tid查询教师
	 */
	public Teacher selectTeacherByTid(String tid);
}
