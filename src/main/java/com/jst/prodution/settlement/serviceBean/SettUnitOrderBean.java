package com.jst.prodution.settlement.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class SettUnitOrderBean extends BaseBean {

    private static final long serialVersionUID = 1L;

    private String logId;

    private String settlementDate;

    private Integer repDate;

    private String merchantId;

    private String jstMerchantId;

    private String merchantName;

    private Long tradeAccount;

    private Long tranAccount;

    private Long feeAmountTotal;

    private Long thdAmountTotal;

    private Long settlementNumber;

    private String remark;

    private String createUser;

    private String updateUser;

    private Date createTime;

    private Date updateTime;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(String settlementDate) {
        this.settlementDate = settlementDate;
    }

    public Integer getRepDate() {
        return repDate;
    }

    public void setRepDate(Integer repDate) {
        this.repDate = repDate;
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

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public Long getTradeAccount() {
        return tradeAccount;
    }

    public void setTradeAccount(Long tradeAccount) {
        this.tradeAccount = tradeAccount;
    }

    public Long getTranAccount() {
        return tranAccount;
    }

    public void setTranAccount(Long tranAccount) {
        this.tranAccount = tranAccount;
    }

    public Long getFeeAmountTotal() {
        return feeAmountTotal;
    }

    public void setFeeAmountTotal(Long feeAmountTotal) {
        this.feeAmountTotal = feeAmountTotal;
    }

    public Long getThdAmountTotal() {
        return thdAmountTotal;
    }

    public void setThdAmountTotal(Long thdAmountTotal) {
        this.thdAmountTotal = thdAmountTotal;
    }

    public Long getSettlementNumber() {
        return settlementNumber;
    }

    public void setSettlementNumber(Long settlementNumber) {
        this.settlementNumber = settlementNumber;
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