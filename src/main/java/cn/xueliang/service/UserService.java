package cn.xueliang.service;

import cn.xueliang.pojo.User;

public interface UserService {
	User selectUserByUid(String uid);
}
