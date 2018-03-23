/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.settlement.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class SettOrderSuppBean extends BaseBean {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    String logId;//唯一标志符
    Integer repDate; // 汇总日期
    Integer settlementDate; // 结算日期
    Integer tranDate; // 交易日期
    String mchntSignAcc; // 拓展商
    String merchantName; // 商户名称
    String merchantId; // 商户号
    String jstMerchantId; // 捷顺通商户号
    Integer settlementNumber; // 结算笔数
    Long tradeAccount; // 交易金额(元)
    Long settlementAccount; // 结算金额(元)
    Long thdAmountTotal; // 分润金额(元)
    Long feeAmountTotal; // 手续费(元)
    String settInOut; // 结算类型
    String settlementState; // 状态
    String payedFlag; // 付款标识(预留字段)
    String remark;//备注
    String createUser; //创建人（系统默认“99”，其它为运营人员ID号）
    String updateUser ;//最后更新人
    Date create_time ; //新增时间
    Date updateTime; //最后更新时间
    
    Long tradeAccountSum; // 交易金额(元)
    Long settlementAccountSum; // 结算金额(元)
    Long thdAmountTotalSum; // 分润金额(元)
    Long feeAmountTotalSum; // 手续费(元)

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public Integer getRepDate() {
        return repDate;
    }

    public void setRepDate(Integer repDate) {
        this.repDate = repDate;
    }

    public Integer getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(Integer settlementDate) {
        this.settlementDate = settlementDate;
    }

    public Integer getTranDate() {
        return tranDate;
    }

    public void setTranDate(Integer tranDate) {
        this.tranDate = tranDate;
    }

    public String getMchntSignAcc() {
        return mchntSignAcc;
    }

    public void setMchntSignAcc(String mchntSignAcc) {
        this.mchntSignAcc = mchntSignAcc;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getJstMerchantId() {
        return jstMerchantId;
    }

    public void setJstMerchantId(String jstMerchantId) {
        this.jstMerchantId = jstMerchantId;
    }

    
    public Integer getSettlementNumber() {
        return settlementNumber;
    }

    public void setSettlementNumber(Integer settlementNumber) {
        this.settlementNumber = settlementNumber;
    }

    public Long getTradeAccount() {
        return tradeAccount;
    }

    public void setTradeAccount(Long tradeAccount) {
        this.tradeAccount = tradeAccount;
    }

    public Long getSettlementAccount() {
        return settlementAccount;
    }

    public void setSettlementAccount(Long settlementAccount) {
        this.settlementAccount = settlementAccount;
    }

    public Long getThdAmountTotal() {
        return thdAmountTotal;
    }

    public void setThdAmountTotal(Long thdAmountTotal) {
        this.thdAmountTotal = thdAmountTotal;
    }

    public Long getFeeAmountTotal() {
        return feeAmountTotal;
    }

    public void setFeeAmountTotal(Long feeAmountTotal) {
        this.feeAmountTotal = feeAmountTotal;
    }

    public String getSettInOut() {
        return settInOut;
    }

    public void setSettInOut(String settInOut) {
        this.settInOut = settInOut;
    }

    public String getSettlementState() {
        return settlementState;
    }

    public void setSettlementState(String settlementState) {
        this.settlementState = settlementState;
    }

    public String getPayedFlag() {
        return payedFlag;
    }

    public void setPayedFlag(String payedFlag) {
        this.payedFlag = payedFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    
    
    
    public Long getTradeAccountSum() {
        return tradeAccountSum;
    }

    public void setTradeAccountSum(Long tradeAccountSum) {
        this.tradeAccountSum = tradeAccountSum;
    }

    public Long getSettlementAccountSum() {
        return settlementAccountSum;
    }

    public void setSettlementAccountSum(Long settlementAccountSum) {
        this.settlementAccountSum = settlementAccountSum;
    }

    public Long getThdAmountTotalSum() {
        return thdAmountTotalSum;
    }

    public void setThdAmountTotalSum(Long thdAmountTotalSum) {
        this.thdAmountTotalSum = thdAmountTotalSum;
    }

    public Long getFeeAmountTotalSum() {
        return feeAmountTotalSum;
    }

    public void setFeeAmountTotalSum(Long feeAmountTotalSum) {
        this.feeAmountTotalSum = feeAmountTotalSum;
    }

    @Override
    public String toString() {
        return "SettOrderSuppBean [logId=" + logId + ", repDate=" + repDate + ", settlementDate=" + settlementDate
                + ", tranDate=" + tranDate + ", mchntSignAcc=" + mchntSignAcc + ", merchantName=" + merchantName
                + ", merchantId=" + merchantId + ", jstMerchantId=" + jstMerchantId + ", settlementNumber="
                + settlementNumber + ", tradeAccount=" + tradeAccount + ", settlementAccount=" + settlementAccount
                + ", thdAmountTotal=" + thdAmountTotal + ", feeAmountTotal=" + feeAmountTotal + ", settInOut="
                + settInOut + ", settlementState=" + settlementState + ", payedFlag=" + payedFlag + ", remark=" + remark
                + ", createUser=" + createUser + ", updateUser=" + updateUser + ", create_time=" + create_time
                + ", updateTime=" + updateTime + ", tradeAccountSum=" + tradeAccountSum + ", settlementAccountSum="
                + settlementAccountSum + ", thdAmountTotalSum=" + thdAmountTotalSum + ", feeAmountTotalSum="
                + feeAmountTotalSum + "]";
    }


}
