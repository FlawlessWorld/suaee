package com.suaee.entity.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.suaee.entity.user.User;
import com.suaee.service.UserService;

public class UserRealm extends AuthorizingRealm{
	
	@Autowired
	private UserService userService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		String username = (String) token.getPrincipal();
		
        User user = userService.queryUserById(Long.parseLong(username));  
          
        if(user==null){  
            //木有找到用户  
            throw new UnknownAccountException("没有找到该账号");  
        }  
        /* if(Boolean.TRUE.equals(user.getLocked())) {   
                throw new LockedAccountException(); //帐号锁定   
            } */  
          
        /** 
         * 交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以在此判断或自定义实现   
         */  
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user.getUserName(), user.getPassword(),getName());  
          
          
        return info; 
	}
	
	@Override  
    public String getName() {  
        return getClass().getName();  
    }  


}
