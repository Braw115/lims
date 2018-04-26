package cn.xueliang.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import cn.xueliang.mapper.UserMapper;
import cn.xueliang.pojo.User;
import cn.xueliang.utils.CustomizedToken;

public class CustoRealm extends AuthorizingRealm {
	@Autowired
	private UserMapper userMapper;
	String password;

	/**
	 * 认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		// 1. token 中获取登录的 username! 注意不需要获取password.
		//UsernamePasswordToken uptoken = (UsernamePasswordToken) token;
		CustomizedToken ctoken =(CustomizedToken) token;
		Object principal = ctoken.getUsername();
		// 2.查询数据库得到用户的信息
		User user = userMapper.selectByPrimaryKey((String) principal);
		
		System.out.println("查询出来的结果" + user.getUid() + "----"+ user.getPassword()+"----"+user.getRole());
		
		if (user != null && user.getRole()==ctoken.getRole()) {
			password = user.getPassword();
			SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,
					password, this.getName());
			return info;
			
		}else{
			return null;
		}
		
		

	}

	/**
	 * 授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {

		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

		Object principal = principals.getPrimaryPrincipal();// 获取登录的用户名
		//Integer role = userMapper.selectByPrimaryKey((String)principal).getRole();
		User user = (User)principal;
		Integer role = user.getRole();
		if (role==0) { // 两个if根据判断赋予登录用户权限
			info.addRole("student");
		}
		if (role==1) {
			info.addRole("teacher");
		}
		return info;
	}

	/*
	 * public void setCredentialMatcher(){ HashedCredentialsMatcher
	 * credentialsMatcher = new HashedCredentialsMatcher();
	 * credentialsMatcher.setHashAlgorithmName("MD5");//MD5算法加密
	 * credentialsMatcher.setHashIterations(1024);//1024次循环加密
	 * setCredentialsMatcher(credentialsMatcher); }
	 */
}
