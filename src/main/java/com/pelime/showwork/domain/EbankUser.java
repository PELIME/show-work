package com.pelime.showwork.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class EbankUser {
    /**
     * 客户号
     */
    @Id
    @Column(length = 20)
    private String customerId;

    @Column(length = 15,nullable = false)
    private String name;

    @Column(length = 11,nullable = false)
    private String phone;

    @Column(length = 4,nullable = false)
    private String dept;

    @Column(length = 18)
    private String  id;

    private Date registerTime;

    @Column(length = 5)
    private String maintainer;

    @Column(length = 10)
    private String grade;

    private Date lastLoginTime;

    private Date lastSpendTime;

    /**
     * @link EbankUserState
     * 状态
     */
    private int state;

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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLastSpendTime() {
        return lastSpendTime;
    }

    public void setLastSpendTime(Date lastSpendTime) {
        this.lastSpendTime = lastSpendTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
