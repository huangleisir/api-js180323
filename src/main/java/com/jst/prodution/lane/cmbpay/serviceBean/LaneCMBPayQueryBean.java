package com.jst.prodution.lane.cmbpay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
* @ClassName: LaneCMBPayQueryBean 
* @Description: TODO(对外暴露一网通支付订单查询Bean) 
* @author zcb 
* @date 2018年1月16日 下午1:58:55 
*
 */
public class LaneCMBPayQueryBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	/*入参*/
	private String orderDate;				//订单日期
	private String orderNo;					//订单流水号
	
	/*出参*/
	private String dateTime;				//银行返回该数据的时间格式：yyyyMMddHHmmss
	private String bankSerialNo;			//银行的订单流水号
	private String orderAmount;				//订单金额,格式：xxxx.xx
	private String fee;						//费用金额,格式：xxxx.xx
	private String settleAmount;			//结算金额,格式：xxxx.xx
	private String discountAmount;			//优惠金额,格式：xxxx.xx无优惠时返回0.00
	private String orderStatus;				//订单状态,0:已结帐1:已撤销2:部分结帐4:未结帐7:冻结交易-冻结金额已经全部结账8:冻结交易，冻结金额只结帐了一部分
	private String cardType;				//卡类型,02：一卡通；03：信用卡；08：他行储蓄卡 09：他行信用卡
	
	
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getBankSerialNo() {
		return bankSerialNo;
	}
	public void setBankSerialNo(String bankSerialNo) {
		this.bankSerialNo = bankSerialNo;
	}
	public String getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
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
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
}
