package com.pelime.showwork.dao;

import com.pelime.showwork.domain.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleDao extends JpaRepository<SysRole,Integer> {
    SysRole findByRoleName(String roleName);
}
