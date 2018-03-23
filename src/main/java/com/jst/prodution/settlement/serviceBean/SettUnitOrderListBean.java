package com.jst.prodution.settlement.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class SettUnitOrderListBean extends BaseBean {

    private static final long serialVersionUID = 1L;

    private String logId;

    private Integer settlementDate;

    private Integer repDate;
    
    private String settlementDateStart;

    private String settlementDateEnd;
    
    private String repDateStart;

    private String repDateEnd;

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
    
    private Long tradeAccountSum;

    private Long tranAccountSum;

    private Long feeAmountTotalSum;

    private Long thdAmountTotalSum;

    private Long settlementNumberSum;
    
    
    private List<SettUnitOrderBean>  settUnitOrderBeanList;
    
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public Integer getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(Integer settlementDate) {
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

    public String getSettlementDateStart() {
        return settlementDateStart;
    }

    public void setSettlementDateStart(String settlementDateStart) {
        this.settlementDateStart = settlementDateStart;
    }

    public String getSettlementDateEnd() {
        return settlementDateEnd;
    }

    public void setSettlementDateEnd(String settlementDateEnd) {
        this.settlementDateEnd = settlementDateEnd;
    }

    public String getRepDateStart() {
        return repDateStart;
    }

    public void setRepDateStart(String repDateStart) {
        this.repDateStart = repDateStart;
    }

    public String getRepDateEnd() {
        return repDateEnd;
    }

    public void setRepDateEnd(String repDateEnd) {
        this.repDateEnd = repDateEnd;
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

    public Long getTradeAccountSum() {
        return tradeAccountSum;
    }

    public void setTradeAccountSum(Long tradeAccountSum) {
        this.tradeAccountSum = tradeAccountSum;
    }

    public Long getTranAccountSum() {
        return tranAccountSum;
    }

    public void setTranAccountSum(Long tranAccountSum) {
        this.tranAccountSum = tranAccountSum;
    }

    public Long getFeeAmountTotalSum() {
        return feeAmountTotalSum;
    }

    public void setFeeAmountTotalSum(Long feeAmountTotalSum) {
        this.feeAmountTotalSum = feeAmountTotalSum;
    }

    public Long getThdAmountTotalSum() {
        return thdAmountTotalSum;
    }

    public void setThdAmountTotalSum(Long thdAmountTotalSum) {
        this.thdAmountTotalSum = thdAmountTotalSum;
    }

    public Long getSettlementNumberSum() {
        return settlementNumberSum;
    }

    public void setSettlementNumberSum(Long settlementNumberSum) {
        this.settlementNumberSum = settlementNumberSum;
    }

    public List<SettUnitOrderBean> getSettUnitOrderBeanList() {
        return settUnitOrderBeanList;
    }

    public void setSettUnitOrderBeanList(List<SettUnitOrderBean> settUnitOrderBeanList) {
        this.settUnitOrderBeanList = settUnitOrderBeanList;
    }

    @Override
    public String toString() {
        return "SettUnitOrderListBean [logId=" + logId + ", settlementDate=" + settlementDate + ", repDate=" + repDate
                + ", settlementDateStart=" + settlementDateStart + ", settlementDateEnd=" + settlementDateEnd
                + ", repDateStart=" + repDateStart + ", repDateEnd=" + repDateEnd + ", merchantId=" + merchantId
                + ", jstMerchantId=" + jstMerchantId + ", merchantName=" + merchantName + ", tradeAccount="
                + tradeAccount + ", tranAccount=" + tranAccount + ", feeAmountTotal=" + feeAmountTotal
                + ", thdAmountTotal=" + thdAmountTotal + ", settlementNumber=" + settlementNumber + ", remark=" + remark
                + ", createUser=" + createUser + ", updateUser=" + updateUser + ", createTime=" + createTime
                + ", updateTime=" + updateTime + ", tradeAccountSum=" + tradeAccountSum + ", tranAccountSum="
                + tranAccountSum + ", feeAmountTotalSum=" + feeAmountTotalSum + ", thdAmountTotalSum="
                + thdAmountTotalSum + ", settlementNumberSum=" + settlementNumberSum + ", settUnitOrderBeanList="
                + settUnitOrderBeanList + "]";
    }

}