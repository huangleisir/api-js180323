package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantInvoicePackage;

public class MerchantInvoicePackageBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6610716060697212404L;

	private String logId;
	private String amount;
	private String tickets;
	private String price;
	private List<MerchantInvoicePackage> packageList;
	
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTickets() {
		return tickets;
	}
	public void setTickets(String tickets) {
		this.tickets = tickets;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public List<MerchantInvoicePackage> getPackageList() {
		return packageList;
	}
	public void setPackageList(List<MerchantInvoicePackage> packageList) {
		this.packageList = packageList;
	}
	
}
