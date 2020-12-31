package com.pelime.showwork.dao;

import com.pelime.showwork.domain.EbankSpendInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EbankSpendInfoDao extends JpaRepository<EbankSpendInfo,Long> {

}
