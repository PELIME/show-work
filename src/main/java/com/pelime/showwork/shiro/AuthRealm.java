package com.pelime.showwork.shiro;

import com.pelime.showwork.domain.SysRole;
import com.pelime.showwork.domain.SysToken;
import com.pelime.showwork.domain.SysUser;
import com.pelime.showwork.service.SysUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AuthRealm extends AuthorizingRealm {

    @Autowired
    private SysUserService sysUserService;


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SysUser user=(SysUser)principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        //user=sysUserService.getById(user.getUid());
        for(SysRole role : user.getRoles()){
            info.addRole(role.getRoleName());
            //该系统粒度只控制到角色 因此下面的权限就不需要了
//            for (Permission permission : role.getPermissions()) {
//                //2.1.1添加权限
//                simpleAuthorizationInfo.addStringPermission(permission.getPermission());
//            }
        }
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String token=(String) authenticationToken.getPrincipal();
        SysToken tk=sysUserService.findByToken(token);
        if(tk==null||tk.getExpireTime().isBefore(LocalDateTime.now())){
            throw new IncorrectCredentialsException("token 失效,请重新登录");
        }
        SysUser user=sysUserService.getById(tk.getUid());
        return new SimpleAuthenticationInfo(user,token,this.getName());
    }
}
