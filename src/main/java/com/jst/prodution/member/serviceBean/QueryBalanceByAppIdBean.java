package com.jst.prodution.member.serviceBean;
/**
 * 账户余额查询
 * @author 侯森川
 *
 */

import com.jst.prodution.base.bean.BaseBean;

public class QueryBalanceByAppIdBean extends BaseBean{
	private static final long serialVersionUID = 1L;
	
	private String appId;    //APPid
	private String thirdUserId;     //第三方会员ID
	private String userId;   //金科会员ID
	private String balanceMoney;      //账户金额
	
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getThirdUserId() {
		return thirdUserId;
	}
	public void setThirdUserId(String thirdUserId) {
		this.thirdUserId = thirdUserId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBalanceMoney() {
		return balanceMoney;
	}
	public void setBalanceMoney(String balanceMoney) {
		this.balanceMoney = balanceMoney;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
