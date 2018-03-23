package com.jst.prodution.lane.cmbpay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
 * @Package: com.jst.prodution.lane.cmbpay.serviceBean
 * @ClassName: LaneCMBPayBean.java
 * @Description: 招行一网通支付bean(M-必填、C-选填)
 *
 * @author: wanghuai
 * @date: 2018年1月17日 上午11:40:39 
 * @version: V1.0
 *
 */
public class LaneCMBPayBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	/**
	 * M-订单创建时间 : yyyyMMddHHmmss
	 */
	private String createTime;   	//订单创建时间-yyyyMMddHHmmss
	/**
	 * C-过期时间跨度,必须为大于零的整数，单位为分钟
	 */
	private String expireTime;		//过期时间跨度,必须为大于零的整数，单位为分钟
	/**
	 * 订单名称
	 */
	private String subject;			//订单名称
	/**
	 * M-支付流水号
	 */
	private String orderNo;			//支付流水号
	/**
	 * M-订单金额
	 */
	private String totalAmount;		//订单金额
	/**
	 * M-客户协议号
	 */
	private String agrNo;			//客户协议号
	/**
	 * C-客户协议流水号
	 */
	private String merchantSerialNo;//客户协议流水号
	/**
	 * C-支付成功页面通知地址
	 */
	
	//出参==================================================================
	private String pageUrl;
	/**
	 * 招行下单json串(返回给前端，由前端组织请求参数)，例如
	 *  <form action="请求地址" method="post" >
     *		<input type="hidden" name="jsonRequestData" value='以上json字符串' />
	 *	</form>
	 */
	private String jsonRequestData; //招行下单参数
	/**
	 * 招行下单接口
	 */
	private String cmbPayUrl;       //招行下单接口
	private Object credential; 		// 支付凭证
	
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getExpireTime() {
		return expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getAgrNo() {
		return agrNo;
	}
	public void setAgrNo(String agrNo) {
		this.agrNo = agrNo;
	}
	public String getMerchantSerialNo() {
		return merchantSerialNo;
	}
	public void setMerchantSerialNo(String merchantSerialNo) {
		this.merchantSerialNo = merchantSerialNo;
	}
	public String getPageUrl() {
		return pageUrl;
	}
	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}
	public Object getCredential() {
		return credential;
	}
	public void setCredential(Object credential) {
		this.credential = credential;
	}
	public String getJsonRequestData() {
		return jsonRequestData;
	}
	public void setJsonRequestData(String jsonRequestData) {
		this.jsonRequestData = jsonRequestData;
	}
	public String getCmbPayUrl() {
		return cmbPayUrl;
	}
	public void setCmbPayUrl(String cmbPayUrl) {
		this.cmbPayUrl = cmbPayUrl;
	}
}
