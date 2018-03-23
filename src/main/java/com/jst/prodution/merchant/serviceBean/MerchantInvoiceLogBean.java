package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantInvoiceLog;

public class MerchantInvoiceLogBean extends BaseBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4884467286530028652L;
	private String logId;			//主键ID
	private String invoiceNo;		//发票申请单号
	private String merchantId;		//商户号
	private String merchantName;	//公司名称
	private String creator;			//操作人/创建人
	private String createTime;		//创建时间
	private String status;			//操作状态
	private String remark;			//备注
	private List<MerchantInvoiceLog> invoiceLogList;
	private boolean flag;
	private String amount;			//充值金额
	private String invoiceNum;		//充值发票张数
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public List<MerchantInvoiceLog> getInvoiceLogList() {
		return invoiceLogList;
	}
	public void setInvoiceLogList(List<MerchantInvoiceLog> invoiceLogList) {
		this.invoiceLogList = invoiceLogList;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getInvoiceNum() {
		return invoiceNum;
	}
	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}
	
}
