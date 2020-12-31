package com.pelime.showwork.service;

import com.pelime.showwork.domain.EbankSpendInfo;
import com.pelime.showwork.domain.EbankUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;
import java.util.List;

public interface EbankService {
    List<EbankUser> findByName(String name);

    /**
     * 通过客户号查找
     * @param cid 客户号
     * @return
     */
    EbankUser findByCid(String cid);
    List<EbankUser> findByMaintainer(String maintainer);
    Page<EbankUser> findByMaintainer(String maintainer, Pageable pageable);

    Page<EbankUser> findByMaintainerAndSpendTimeBefore(String maintainer, Date spendTime, Pageable pageable);
    Page<EbankUser> findByMaintainerAndSpendTimeAfter(String maintainer, Date spendTime, Pageable pageable);

    Page<EbankUser> findByDeptAndMaintainerAndSpendTimeBefore(String department,String maintainer, Date spendTime, Pageable pageable);
    Page<EbankUser> findByDeptAndMaintainerAndSpendTimeAfter(String department,String maintainer, Date spendTime, Pageable pageable);

    int CountMyCustomer(String maintainer);
    int CountMyCustomerSpendAfter(String maintainer,Date spendTime);
    int CountMyCustomerNotSpendAfter(String maintainer,Date spendTime);

    EbankUser edit(EbankUser ebankUser);
    EbankUser saveOne(EbankUser ebankUser);
    EbankUser saveAll(List<EbankUser> ebankUsers);
    EbankUser manageOneByCid(String cid,String username);
    int manageAllByCid(List<String> cids,String username);
    EbankSpendInfo saveSpendInfo(EbankSpendInfo spendInfo);
    int saveAllSpendInfo(List<EbankSpendInfo> infos);
}
