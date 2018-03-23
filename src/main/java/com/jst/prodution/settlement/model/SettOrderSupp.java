package com.jst.prodution.settlement.model;

import java.util.Date;

public class SettOrderSupp {
    private String logId;

    private Integer repDate;

    private Integer settlementDate;

    private Integer tranDate;

    private String mchntSignAcc;

    private String merchantName;

    private String merchantId;

    private String jstMerchantId;

    private Integer settlementNumber;

    private Long tradeAccount;

    private Long settlementAccount;

    private Long thdAmountTotal;

    private Long feeAmountTotal;

    private String settInOut;

    private String settlementState;

    private String payedFlag;

    private String remark;

    private String createUser;

    private String updateUser;

    private Date createTime;

    private Date updateTime;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
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
        this.mchntSignAcc = mchntSignAcc == null ? null : mchntSignAcc.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getJstMerchantId() {
        return jstMerchantId;
    }

    public void setJstMerchantId(String jstMerchantId) {
        this.jstMerchantId = jstMerchantId == null ? null : jstMerchantId.trim();
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
        this.settInOut = settInOut == null ? null : settInOut.trim();
    }

    public String getSettlementState() {
        return settlementState;
    }

    public void setSettlementState(String settlementState) {
        this.settlementState = settlementState == null ? null : settlementState.trim();
    }

    public String getPayedFlag() {
        return payedFlag;
    }

    public void setPayedFlag(String payedFlag) {
        this.payedFlag = payedFlag == null ? null : payedFlag.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}