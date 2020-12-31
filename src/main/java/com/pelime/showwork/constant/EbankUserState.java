package com.pelime.showwork.constant;

/**
 * 手机银行用户状态
 */
public class EbankUserState {
    /**
     * 正常
     */
    public static int NORMAL=0;
    /**
     * 睡眠：一年以上没动张用户
     */
    public static int SLEEP=1;
    /**
     * 计划效户状态
     * 人工把睡眠户设置为计划效户状态
     */
    public static int TO_CANCELLATION=2;
    /**
     * 已销户
     */
    public static int CANCELLED=3;
}
