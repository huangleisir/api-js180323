package com.jst.prodution.reward.common.dto.resp;



import java.util.List;

import com.jst.prodution.reward.common.dto.XGenericResponseDTO;
import com.jst.prodution.reward.serviceBean.SigninConfiguration;

public class RQ0004RespDto extends XGenericResponseDTO {

	private static final long serialVersionUID = -8856430258357808940L;
	
	 private List<SigninConfiguration> dataList;
	 
	 private int days;
	 
	

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public List<SigninConfiguration> getDataList() {
		return dataList;
	}

	public void setDataList(List<SigninConfiguration> dataList) {
		this.dataList = dataList;
	}
	
}
