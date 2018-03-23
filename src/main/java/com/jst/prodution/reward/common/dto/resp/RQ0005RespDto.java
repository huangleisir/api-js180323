package com.jst.prodution.reward.common.dto.resp;



import java.util.List;

import com.jst.prodution.reward.common.dto.XGenericResponseDTO;
import com.jst.prodution.reward.serviceBean.UserLevelConfig;

public class RQ0005RespDto extends XGenericResponseDTO {

	private static final long serialVersionUID = -8856430258357808940L;
	
	 private List<UserLevelConfig> dataList;

	public List<UserLevelConfig> getDataList() {
		return dataList;
	}

	public void setDataList(List<UserLevelConfig> dataList) {
		this.dataList = dataList;
	}
	
}
