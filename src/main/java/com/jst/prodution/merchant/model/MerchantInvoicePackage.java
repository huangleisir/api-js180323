package com.jst.prodution.merchant.model;

import java.io.Serializable;

public class MerchantInvoicePackage implements Serializable{

	private static final long serialVersionUID = -2064917751434687233L;
	
	private String logId;
	private String amount;
	private String tickets;
	private String price;
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
}
