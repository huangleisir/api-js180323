package com.jst.prodution.account.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
/**
 * 
 * @Package: com.jst.prodution.account.serviceBean
 * @ClassName: AcctDedDedBean.java
 * @Description: 支取+支取组合接口
 *
 * @author: wanghuai
 * @date: 2018年3月12日 上午11:02:12 
 * @version: V1.0
 *
 */
public class AcctDedDedBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	/**
	 * 账户交易码 必输
	 */
	private String tradeCode;	//账户交易码 	必输
	/**
	 * 账户标识	必输
	 */
	private String  acctId;		//账户标识	必输	
	/**
	 * 交易流水号	必输	业务系统流水号(交易核心为交易订单号)
	 */
	private String  busNo;		//交易流水号	必输	业务系统流水号(交易核心为交易订单号)
	/**
	 * 业务类型	必输	订单交易类型
	 */
	private String  busTranType;//业务类型	必输	订单交易类型
	/**
	 * 交易日期	必输	8位整型，例如：20150409
	 */
	private Integer  busTransDate;//交易日期	必输	8位整型，例如：20150409
	/**
	 * 交易金额	必输	格式整数，单位为分
	 */
	private Long  tranAmount;	//交易金额	必输	格式整数，单位为分
	/**
	 * 币别(1-CNY) 必输
	 */
	private Integer currency;	//币别(1-CNY) 必输
	/**
	 * 对方账户号	可输	对方账户非会计内部账户（外部账户）必输
	 */
	private String  oppAcctId;	//对方账户号	可输	对方账户非会计内部账户（外部账户）必输
	/**
	 * 业务来源	必输	（1-APP，2-OMS，3-交易核心）
	 */
	private String  sourceFrom;	//业务来源	必输	（1-APP，2-OMS，3-交易核心）
	/**
	 * 备注	可输 
	 */
	private String  remark;		//备注	可输 
	/**
	 * 支付流水号 账户前置生成
	 */
	private String payNo;		//支付流水号 账户前置生成
	public String getTradeCode() {
		return tradeCode;
	}
	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}
	public String getAcctId() {
		return acctId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getBusTranType() {
		return busTranType;
	}
	public void setBusTranType(String busTranType) {
		this.busTranType = busTranType;
	}
	public Integer getBusTransDate() {
		return busTransDate;
	}
	public void setBusTransDate(Integer busTransDate) {
		this.busTransDate = busTransDate;
	}
	public Long getTranAmount() {
		return tranAmount;
	}
	public void setTranAmount(Long tranAmount) {
		this.tranAmount = tranAmount;
	}
	public Integer getCurrency() {
		return currency;
	}
	public void setCurrency(Integer currency) {
		this.currency = currency;
	}
	public String getOppAcctId() {
		return oppAcctId;
	}
	public void setOppAcctId(String oppAcctId) {
		this.oppAcctId = oppAcctId;
	}
	public String getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	
}
