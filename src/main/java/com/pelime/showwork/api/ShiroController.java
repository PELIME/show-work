package com.pelime.showwork.api;

import com.pelime.showwork.dao.SysTokenDao;
import com.pelime.showwork.domain.SysUser;
import com.pelime.showwork.model.XResponse;
import com.pelime.showwork.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("sys")
public class ShiroController {
    @Autowired
    private SysUserService sysUserService;

//    @Autowired
//    private SysTokenDao sysTokenDao;
    @RequestMapping("login")
    public XResponse login(String username,String password){
        SysUser sysUser=sysUserService.getByUsername(username);
        if(sysUser==null||!sysUser.getPassword().equals(password)){
            return XResponse.fail(400,"账号或密码有误");
        }
        else {
            return XResponse.success("登录成功").data(sysUserService.createToken(sysUser.getUid()));
        }
    }

    @RequestMapping("logout")
    public XResponse logout(String token){
        sysUserService.logout(token);
        return XResponse.success("您已安全退出系统");
    }

}
