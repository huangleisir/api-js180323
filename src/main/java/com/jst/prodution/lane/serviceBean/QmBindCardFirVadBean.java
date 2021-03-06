/**
 * author:汤广海
 * 2016年11月1日
 * 下午3:30:24
 */
package com.jst.prodution.lane.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @author Administrator
 *
 */
public class QmBindCardFirVadBean extends BaseBean {

	/**
	 * 快钱-绑卡第一次验证
	 */
	private static final long serialVersionUID = 1L;

	private String merchantId;// 商户编号
	private String terminalId;// 终端号
	private String customerId;// 客户号
	private String externalRefNumber;// 外部跟踪编号
	private String pan;// 卡号
	private String cardHolderName;// 持卡人户名
	private String idType;// 证件类型
	private String cardHolderId;// 证件号码
	private String expiredDate;// 卡效期
	private String cvv2;// 安全校验值
	private String phoneNO;// 手机号码
	private String storablePan;// 缩略卡号
	private String responseCode;// 应答码
	private String responseTextMessage;// 应答码文本消息
	private String token;// 令牌信息
	private String bankCardType;//银行卡类型
	
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getExternalRefNumber() {
		return externalRefNumber;
	}
	public void setExternalRefNumber(String externalRefNumber) {
		this.externalRefNumber = externalRefNumber;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getCardHolderId() {
		return cardHolderId;
	}
	public void setCardHolderId(String cardHolderId) {
		this.cardHolderId = cardHolderId;
	}
	public String getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
	}
	public String getCvv2() {
		return cvv2;
	}
	public void setCvv2(String cvv2) {
		this.cvv2 = cvv2;
	}
	public String getPhoneNO() {
		return phoneNO;
	}
	public void setPhoneNO(String phoneNO) {
		this.phoneNO = phoneNO;
	}
	public String getStorablePan() {
		return storablePan;
	}
	public void setStorablePan(String storablePan) {
		this.storablePan = storablePan;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseTextMessage() {
		return responseTextMessage;
	}
	public void setResponseTextMessage(String responseTextMessage) {
		this.responseTextMessage = responseTextMessage;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getBankCardType() {
		return bankCardType;
	}
	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}

}
