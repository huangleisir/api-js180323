package com.jst.prodution.lane.cmbpay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
/**
 * 
* @ClassName: LaneCMBRefundQueryBean 
* @Description: TODO(对外暴露一网通退款订单查询Bean) 
* @author zcb
* @date 2018年1月16日 上午10:49:34 
*
 */
public class LaneCMBRefundQueryBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	/*入参*/
	private String orderNo;						//原支付订单流水号
	private String refundNo;					//退款流水号
	private String orderDate;					//原支付订单日期
	
	/*出参*/
	private String bankSerialNo;				//银行退款流水号
	private String orderStatus;					//210：已直接退款  240：已授权退款
	private String amount;						//退款金额,格式：xxxx.xx
	private String fee;							//费用金额,格式：xxxx.xx
	private String desc;						//退款描述
	private String settleAmount;				//实际退款金额,格式：xxxx.xx
	private String discountAmount;				//退回优惠金额,格式：xxxx.xx
	
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getRefundNo() {
		return refundNo;
	}
	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getBankSerialNo() {
		return bankSerialNo;
	}
	public void setBankSerialNo(String bankSerialNo) {
		this.bankSerialNo = bankSerialNo;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getSettleAmount() {
		return settleAmount;
	}
	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}
	public String getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
}
