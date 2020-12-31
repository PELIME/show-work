package com.pelime.showwork.service;

import com.pelime.showwork.domain.SysRole;

import java.util.List;

public interface SysRoleService {
    int addRole(SysRole role);
    int edit(SysRole role);
    int delete(SysRole role);
    List<SysRole> getAll();
    SysRole getByName(String name);
}
