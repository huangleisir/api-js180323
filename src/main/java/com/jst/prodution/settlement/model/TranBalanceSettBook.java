package com.jst.prodution.settlement.model;

import java.util.Date;

public class TranBalanceSettBook implements java.io.Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String settSeq;

    private Integer settDate;

    private String settType;

    private String settInOut;

    private Integer settCycle;

    private Integer settlementDate;

    private Long tranAmount;
    private Long disCountAmt;

    private Long payAmount;
    private Long settAmount;
    private Long qdiscAmt;

    private Long settAmt;
    private String settAmountType;


    private Long feeAmt;

    private Long othAmt;

    private String settStatus;

    private Integer settNo;

    private String outMchNo;

    private String outMchmemId;

    private String outMchName;

    private String inMchNo;

    private String inMchmemId;

    private String inMchName;

    private String inBankCard;//拓展商

    private String inBankcardName;

    private String inBankName;

    private String inBankCode;

    private String inBankBranch;

    private Integer clearDate;

    private String clearSeq;

    private Integer tranDate;

    private String tranSeq;

    private Date createdOn;

    private Date updatedOn;

    private String remark;

    private String upMchNo;

    private String upMchmemId;

    private String upMchName;
    
    private Integer numCount;
    private String tranMchNo;

    private String tranMchId;

    private String merchantExtenalNo;
    private String jstMerchantId;
    private String merchantLvl;
    public String getSettSeq() {
        return settSeq;
    }

    public void setSettSeq(String settSeq) {
        this.settSeq = settSeq == null ? null : settSeq.trim();
    }

    public Integer getSettDate() {
        return settDate;
    }

    public void setSettDate(Integer settDate) {
        this.settDate = settDate;
    }

    public String getSettType() {
        return settType;
    }

    public void setSettType(String settType) {
        this.settType = settType == null ? null : settType.trim();
    }

    public String getSettInOut() {
        return settInOut;
    }

    public void setSettInOut(String settInOut) {
        this.settInOut = settInOut == null ? null : settInOut.trim();
    }

    public Integer getSettCycle() {
        return settCycle;
    }

    public void setSettCycle(Integer settCycle) {
        this.settCycle = settCycle;
    }

    public Integer getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(Integer settlementDate) {
        this.settlementDate = settlementDate;
    }

    public Long getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(Long tranAmount) {
        this.tranAmount = tranAmount;
    }

    public Long getSettAmount() {
        return settAmount;
    }

    public void setSettAmount(Long settAmount) {
        this.settAmount = settAmount;
    }

    public String getSettAmountType() {
        return settAmountType;
    }

    public void setSettAmountType(String settAmountType) {
        this.settAmountType = settAmountType == null ? null : settAmountType.trim();
    }
    public Long getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(Long feeAmt) {
        this.feeAmt = feeAmt;
    }

    public Long getOthAmt() {
        return othAmt;
    }

    public void setOthAmt(Long othAmt) {
        this.othAmt = othAmt;
    }
    public String getSettStatus() {
        return settStatus;
    }

    public void setSettStatus(String settStatus) {
        this.settStatus = settStatus == null ? null : settStatus.trim();
    }

    public Integer getSettNo() {
        return settNo;
    }

    public void setSettNo(Integer settNo) {
        this.settNo = settNo;
    }

    public String getOutMchNo() {
        return outMchNo;
    }

    public void setOutMchNo(String outMchNo) {
        this.outMchNo = outMchNo == null ? null : outMchNo.trim();
    }

    public String getOutMchmemId() {
        return outMchmemId;
    }

    public void setOutMchmemId(String outMchmemId) {
        this.outMchmemId = outMchmemId == null ? null : outMchmemId.trim();
    }

    public String getOutMchName() {
        return outMchName;
    }

    public void setOutMchName(String outMchName) {
        this.outMchName = outMchName == null ? null : outMchName.trim();
    }

    public String getInMchNo() {
        return inMchNo;
    }

    public void setInMchNo(String inMchNo) {
        this.inMchNo = inMchNo == null ? null : inMchNo.trim();
    }

    public String getInMchmemId() {
        return inMchmemId;
    }

    public void setInMchmemId(String inMchmemId) {
        this.inMchmemId = inMchmemId == null ? null : inMchmemId.trim();
    }

    public String getInMchName() {
        return inMchName;
    }

    public void setInMchName(String inMchName) {
        this.inMchName = inMchName == null ? null : inMchName.trim();
    }

    public String getInBankCard() {
        return inBankCard;
    }

    public void setInBankCard(String inBankCard) {
        this.inBankCard = inBankCard == null ? null : inBankCard.trim();
    }

    public String getInBankcardName() {
        return inBankcardName;
    }

    public void setInBankcardName(String inBankcardName) {
        this.inBankcardName = inBankcardName == null ? null : inBankcardName.trim();
    }

    public String getInBankName() {
        return inBankName;
    }

    public void setInBankName(String inBankName) {
        this.inBankName = inBankName == null ? null : inBankName.trim();
    }

    public String getInBankCode() {
        return inBankCode;
    }

    public void setInBankCode(String inBankCode) {
        this.inBankCode = inBankCode == null ? null : inBankCode.trim();
    }

    public String getInBankBranch() {
        return inBankBranch;
    }

    public void setInBankBranch(String inBankBranch) {
        this.inBankBranch = inBankBranch == null ? null : inBankBranch.trim();
    }

    public Integer getClearDate() {
        return clearDate;
    }

    public void setClearDate(Integer clearDate) {
        this.clearDate = clearDate;
    }

    public String getClearSeq() {
        return clearSeq;
    }

    public void setClearSeq(String clearSeq) {
        this.clearSeq = clearSeq == null ? null : clearSeq.trim();
    }

    public Integer getTranDate() {
        return tranDate;
    }

    public void setTranDate(Integer tranDate) {
        this.tranDate = tranDate;
    }

    public String getTranSeq() {
        return tranSeq;
    }

    public void setTranSeq(String tranSeq) {
        this.tranSeq = tranSeq == null ? null : tranSeq.trim();
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getUpMchNo() {
        return upMchNo;
    }

    public void setUpMchNo(String upMchNo) {
        this.upMchNo = upMchNo == null ? null : upMchNo.trim();
    }

    public String getUpMchmemId() {
        return upMchmemId;
    }

    public void setUpMchmemId(String upMchmemId) {
        this.upMchmemId = upMchmemId == null ? null : upMchmemId.trim();
    }

    public String getUpMchName() {
        return upMchName;
    }

    public void setUpMchName(String upMchName) {
        this.upMchName = upMchName == null ? null : upMchName.trim();
    }

    public Integer getNumCount() {
        return numCount;
    }

    public void setNumCount(Integer numCount) {
        this.numCount = numCount;
    }


    public Long getDisCountAmt() {
        return disCountAmt;
    }

    public void setDisCountAmt(Long disCountAmt) {
        this.disCountAmt = disCountAmt;
    }

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }
    public String getMerchantLvl() {
        return merchantLvl;
    }

    public void setMerchantLvl(String merchantLvl) {
        this.merchantLvl = merchantLvl;
    }

    public String getTranMchNo() {
        return tranMchNo;
    }

    public void setTranMchNo(String tranMchNo) {
        this.tranMchNo = tranMchNo;
    }

    public String getTranMchId() {
        return tranMchId;
    }

    public void setTranMchId(String tranMchId) {
        this.tranMchId = tranMchId;
    }

    public String getMerchantExtenalNo() {
        return merchantExtenalNo;
    }

    public void setMerchantExtenalNo(String merchantExtenalNo) {
        this.merchantExtenalNo = merchantExtenalNo;
    }

    public String getJstMerchantId() {
        return jstMerchantId;
    }

    public void setJstMerchantId(String jstMerchantId) {
        this.jstMerchantId = jstMerchantId;
    }

    public Long getQdiscAmt() {
        return qdiscAmt;
    }

    public void setQdiscAmt(Long qdiscAmt) {
        this.qdiscAmt = qdiscAmt;
    }

    public Long getSettAmt() {
        return settAmt;
    }

    public void setSettAmt(Long settAmt) {
        this.settAmt = settAmt;
    }
}