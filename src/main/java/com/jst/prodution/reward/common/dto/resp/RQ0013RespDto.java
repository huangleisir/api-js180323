package com.jst.prodution.reward.common.dto.resp;

import com.jst.prodution.reward.common.dto.XGenericResponseDTO;

public class RQ0013RespDto extends XGenericResponseDTO{
 
	private static final long serialVersionUID = -2296008101039812975L;
	/**
	* @Fields 当前好豆值
	*/
	private Long balance;

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	

}
