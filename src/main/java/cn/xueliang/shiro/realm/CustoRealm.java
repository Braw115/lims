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
	 * ��֤
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		// 1. token �л�ȡ��¼�� username! ע�ⲻ��Ҫ��ȡpassword.
		//UsernamePasswordToken uptoken = (UsernamePasswordToken) token;
		CustomizedToken ctoken =(CustomizedToken) token;
		Object principal = ctoken.getUsername();
		// 2.��ѯ���ݿ�õ��û�����Ϣ
		User user = userMapper.selectByPrimaryKey((String) principal);
		
		System.out.println("��ѯ�����Ľ��" + user.getUid() + "----"+ user.getPassword()+"----"+user.getRole());
		
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
	 * ��Ȩ
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {

		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

		Object principal = principals.getPrimaryPrincipal();// ��ȡ��¼���û���
		//Integer role = userMapper.selectByPrimaryKey((String)principal).getRole();
		User user = (User)principal;
		Integer role = user.getRole();
		if (role==0) { // ����if�����жϸ����¼�û�Ȩ��
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
	 * credentialsMatcher.setHashAlgorithmName("MD5");//MD5�㷨����
	 * credentialsMatcher.setHashIterations(1024);//1024��ѭ������
	 * setCredentialsMatcher(credentialsMatcher); }
	 */
}
