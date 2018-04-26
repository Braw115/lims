package cn.xueliang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xueliang.mapper.UserMapper;
import cn.xueliang.pojo.User;
import cn.xueliang.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper usermMpper;
	@Override
	public User selectUserByUid(String uid) {
		User user = usermMpper.selectByPrimaryKey(uid);
		return user;
	}

	
	

}
