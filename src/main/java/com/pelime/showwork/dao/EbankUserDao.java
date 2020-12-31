package com.pelime.showwork.dao;

import com.pelime.showwork.domain.EbankUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EbankUserDao extends JpaRepository<EbankUser,String> {
}
