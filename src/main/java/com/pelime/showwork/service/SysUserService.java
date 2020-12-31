package com.pelime.showwork.service;

import com.pelime.showwork.domain.SysRole;
import com.pelime.showwork.domain.SysToken;
import com.pelime.showwork.domain.SysUser;

import java.util.List;
import java.util.Map;

public interface SysUserService {
    int login(String username,String password);
    int register(SysUser user, List<SysRole> roles);
    int logout(String token);
    SysUser edit(SysUser user);
    List<SysUser> getAll();
    SysUser getByUsername(String username);
    SysUser getById(Integer id);
    Map<String,Object> createToken(Integer uid);
    SysToken findByToken(String accessToken);
    SysToken findTokenByUserId(Integer userId);
}
