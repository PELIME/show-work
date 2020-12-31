package com.pelime.showwork.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class EbankSpendInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int year;

    private int mouth;

    private int SpendNum;

    private BigDecimal SpendCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public int getSpendNum() {
        return SpendNum;
    }

    public void setSpendNum(int spendNum) {
        SpendNum = spendNum;
    }

    public BigDecimal getSpendCount() {
        return SpendCount;
    }

    public void setSpendCount(BigDecimal spendCount) {
        SpendCount = spendCount;
    }
}
