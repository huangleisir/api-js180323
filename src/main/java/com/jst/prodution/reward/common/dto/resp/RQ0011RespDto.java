package com.jst.prodution.reward.common.dto.resp;

import com.jst.prodution.reward.common.dto.XGenericResponseDTO;
import com.jst.prodution.reward.serviceBean.CommonConfiguration;

public class RQ0011RespDto extends XGenericResponseDTO{
	
	private CommonConfiguration  commonConfiguration;

	public CommonConfiguration getCommonConfiguration() {
		return commonConfiguration;
	}

	public void setCommonConfiguration(CommonConfiguration commonConfiguration) {
		this.commonConfiguration = commonConfiguration;
	}
	

}
