package com.pelime.showwork.dao;

import com.pelime.showwork.domain.SysToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysTokenDao extends JpaRepository<SysToken,Integer> {
    SysToken findByToken(String token);
    SysToken findByUid(Integer uid);
}
