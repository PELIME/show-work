package com.pelime.showwork.dao;

import com.pelime.showwork.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserDao extends JpaRepository<SysUser, Integer> {
    SysUser findByUsername(String username);
}
