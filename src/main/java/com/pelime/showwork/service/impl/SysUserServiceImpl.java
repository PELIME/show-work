package com.pelime.showwork.service.impl;

import com.pelime.showwork.dao.SysRoleDao;
import com.pelime.showwork.dao.SysTokenDao;
import com.pelime.showwork.dao.SysUserDao;
import com.pelime.showwork.domain.SysRole;
import com.pelime.showwork.domain.SysToken;
import com.pelime.showwork.domain.SysUser;
import com.pelime.showwork.service.SysUserService;
import com.pelime.showwork.util.TokenGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TODO
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    //12小时后过期
    private final static int EXPIRE = 12;

    @Autowired
    SysRoleDao sysRoleDao;

    @Autowired
    SysUserDao sysUserDao;

    @Autowired
    SysTokenDao sysTokenDao;

    @Override
    public int login(String username, String password) {
        return 0;
    }

    @Override
    public int register(SysUser user, List<SysRole> roles) {
        return 0;
    }

    @Override
    public int logout(String token) {
        SysToken sysToken=findByToken(token);
        token=TokenGenerator.generateValue();
        SysToken token1=new SysToken();
        token1.setUid(sysToken.getUid());
        token1.setToken(token);
        sysTokenDao.save(token1);
        return 0;
    }

    @Override
    public SysUser edit(SysUser user) {
        return null;
    }

    @Override
    public List<SysUser> getAll() {
        return null;
    }

    @Override
    public SysUser getByUsername(String username) {
        SysUser user=sysUserDao.findByUsername(username);
        return user;
    }

    @Override
    public SysUser getById(Integer id) {
        return sysUserDao.getOne(id);
    }

    @Override
    public Map<String, Object> createToken(Integer uid) {
        Map<String,Object> res=new HashMap<>();
        String token= TokenGenerator.generateValue();
        LocalDateTime now=LocalDateTime.now();
        LocalDateTime expireTime=now.plusHours(EXPIRE);
        SysToken sysToken=sysTokenDao.findByUid(uid);
        if(sysToken==null){
            sysToken=new SysToken();
            sysToken.setUid(uid);
            sysToken.setToken(token);
            sysToken.setUpdateTime(now);
            sysToken.setExpireTime(expireTime);
            sysTokenDao.save(sysToken);
        }
        else {
            sysToken.setToken(token);
            sysToken.setUpdateTime(now);
            sysToken.setExpireTime(expireTime);
            sysTokenDao.save(sysToken);
        }
        res.put("token",token);
        res.put("expire",EXPIRE*3600);
        return res;
    }

    @Override
    public SysToken findByToken(String accessToken) {
        return sysTokenDao.findByToken(accessToken);
    }

    @Override
    public SysToken findTokenByUserId(Integer userId) {
        return sysTokenDao.getOne(userId);
    }

}
