package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 根据卡号或者userid查询用户userid、openid等信息
 * @author 
 *
 */
public class QueryUserOpenidBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String appid;		//appid
	private String userId;		//用户ID，通过手机号卡号查询到用户必须返回
	private String cardNo;		//卡号
	private String cardType;		//卡类型
	
	
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	private String openId ;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	
	

}
