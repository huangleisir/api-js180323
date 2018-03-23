package com.jst.prodution.park.serviceBean;

import java.io.Serializable;
/**
 * 类名: ChargeOrderTranFlowBean</br>
 * 作者: lin
 * 描述: 充电订单交易流水Bean 
 * 创建时间: 2018年1月19日下午3:30:51
 * 版权及版本: Copyright(C)2018 jst版权所有
 */
public class ChargeOrderTranFlowBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String ordid;// 平台订单号
	
    private String payreqssn;// 支付请求流水

    private String transtype;//交易业务类型  01-正常缴费；02-补交；

    private String seqamt;//金额
    
    private String starttime;//支付流水开始时间yyyyMMddhhmmss
    
    private String endtime;//支付流水结束时间yyyyMMddhhmmss

    private String timefordtl;//充电计费时长:单位 秒，该笔费用支撑的时长，

    private String seqstatus;//流水状态 00-无需支付；01-待支付； 02-已支付；03-支付失败无需支付；

    private String payseq;//支付流水号   02-已支付必填

    private String paytime;//支付时间   02-已支付必填

    
	public String getOrdid() {
		return ordid;
	}

	public void setOrdid(String ordid) {
		this.ordid = ordid;
	}

	public String getPayreqssn() {
		return payreqssn;
	}

	public void setPayreqssn(String payreqssn) {
		this.payreqssn = payreqssn;
	}

	public String getTranstype() {
		return transtype;
	}

	public void setTranstype(String transtype) {
		this.transtype = transtype;
	}

	public String getSeqamt() {
		return seqamt;
	}

	public void setSeqamt(String seqamt) {
		this.seqamt = seqamt;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getTimefordtl() {
		return timefordtl;
	}

	public void setTimefordtl(String timefordtl) {
		this.timefordtl = timefordtl;
	}

	public String getSeqstatus() {
		return seqstatus;
	}

	public void setSeqstatus(String seqstatus) {
		this.seqstatus = seqstatus;
	}

	public String getPayseq() {
		return payseq;
	}

	public void setPayseq(String payseq) {
		this.payseq = payseq;
	}

	public String getPaytime() {
		return paytime;
	}

	public void setPaytime(String paytime) {
		this.paytime = paytime;
	}
}
