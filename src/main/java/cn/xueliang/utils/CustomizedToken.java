package cn.xueliang.utils;

import org.apache.shiro.authc.UsernamePasswordToken;

public class CustomizedToken extends UsernamePasswordToken  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer role;
	

	public CustomizedToken(String username,String password, Integer role) {
		super(username,password);
		this.role = role;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}
	
}
