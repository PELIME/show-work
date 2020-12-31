package com.pelime.showwork.service.impl;

import com.pelime.showwork.domain.EbankSpendInfo;
import com.pelime.showwork.domain.EbankUser;
import com.pelime.showwork.service.EbankService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

//TODO
@Service("ebankService")
public class EbankServiceImpl implements EbankService {
    @Override
    public List<EbankUser> findByName(String name) {
        return null;
    }

    @Override
    public EbankUser findByCid(String cid) {
        return null;
    }

    @Override
    public List<EbankUser> findByMaintainer(String maintainer) {
        return null;
    }

    @Override
    public Page<EbankUser> findByMaintainer(String maintainer, Pageable pageable) {
        return null;
    }

    @Override
    public Page<EbankUser> findByMaintainerAndSpendTimeBefore(String maintainer, Date spendTime, Pageable pageable) {
        return null;
    }

    @Override
    public Page<EbankUser> findByMaintainerAndSpendTimeAfter(String maintainer, Date spendTime, Pageable pageable) {
        return null;
    }

    @Override
    public Page<EbankUser> findByDeptAndMaintainerAndSpendTimeBefore(String department, String maintainer, Date spendTime, Pageable pageable) {
        return null;
    }

    @Override
    public Page<EbankUser> findByDeptAndMaintainerAndSpendTimeAfter(String department, String maintainer, Date spendTime, Pageable pageable) {
        return null;
    }

    @Override
    public int CountMyCustomer(String maintainer) {
        return 0;
    }

    @Override
    public int CountMyCustomerSpendAfter(String maintainer, Date spendTime) {
        return 0;
    }

    @Override
    public int CountMyCustomerNotSpendAfter(String maintainer, Date spendTime) {
        return 0;
    }

    @Override
    public EbankUser edit(EbankUser ebankUser) {
        return null;
    }

    @Override
    public EbankUser saveOne(EbankUser ebankUser) {
        return null;
    }

    @Override
    public EbankUser saveAll(List<EbankUser> ebankUsers) {
        return null;
    }

    @Override
    public EbankUser manageOneByCid(String cid, String username) {
        return null;
    }

    @Override
    public int manageAllByCid(List<String> cids, String username) {
        return 0;
    }

    @Override
    public EbankSpendInfo saveSpendInfo(EbankSpendInfo spendInfo) {
        return null;
    }

    @Override
    public int saveAllSpendInfo(List<EbankSpendInfo> infos) {
        return 0;
    }
}
