package com.pelime.showwork.service.impl;

import com.pelime.showwork.domain.SysRole;
import com.pelime.showwork.service.SysRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

//TODO
@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {
    @Override
    public int addRole(SysRole role) {
        return 0;
    }

    @Override
    public int edit(SysRole role) {
        return 0;
    }

    @Override
    public int delete(SysRole role) {
        return 0;
    }

    @Override
    public List<SysRole> getAll() {
        return null;
    }

    @Override
    public SysRole getByName(String name) {
        return null;
    }
}
