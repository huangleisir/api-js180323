package com.jst.prodution.reward.common.dto.req;

import com.jst.prodution.reward.common.dto.XGenericRequestDTO;

public class RQ0013ReqDto extends XGenericRequestDTO{
	
	/**
	* @Fields 用户Id
	*/
	private String userId;         
	
	/**
	* @Fields 账户类型(01-基本户,02-待结算账户，03-备付金账户，04-待清算账户，05-代扣长款户，06-代付长款户，07-代扣短款户，08-代付短款户，09-贷款收款户、10-贷款付款户、11-积分户)
	*/
	private String accountType;
	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	

}
