package com.jst.prodution.reward.common.dto.req;

import com.jst.prodution.reward.common.dto.XGenericRequestDTO;

public class RT0001ReqDto extends XGenericRequestDTO{

	/**   
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)   
	 */  
	private static final long serialVersionUID = 5797834397685857597L;

	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
