package com.pelime.showwork.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * 新增待认领客户
 */
@Entity
public class NewEbankUser {
    @Id
    @Column(length = 20)
    private String customerId;

    @Column(length = 15,nullable = false)
    private String name;

    @Column(length = 11,nullable = false)
    private String phone;

    private Date registerTime;

    /**
     * 开户人员
     */
    @Column(length = 5)
    private String AccountOpeningPersonnel;

    /**
     * 是否已经认领
     */
    @Column(nullable = false)
    private boolean isHandle;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getAccountOpeningPersonnel() {
        return AccountOpeningPersonnel;
    }

    public void setAccountOpeningPersonnel(String accountOpeningPersonnel) {
        AccountOpeningPersonnel = accountOpeningPersonnel;
    }

    public boolean isHandle() {
        return isHandle;
    }

    public void setHandle(boolean handle) {
        isHandle = handle;
    }
}
