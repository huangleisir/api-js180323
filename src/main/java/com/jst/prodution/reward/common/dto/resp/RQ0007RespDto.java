package com.jst.prodution.reward.common.dto.resp;



import com.jst.prodution.reward.common.dto.XGenericResponseDTO;
import com.jst.prodution.reward.serviceBean.UserLevel;

public class RQ0007RespDto extends XGenericResponseDTO {

	private static final long serialVersionUID = -8856430258357808940L;
	
	 private UserLevel data;

	 //到下一级需要的好币值
	 private int  nextLevelValue;
	 
	public int getNextLevelValue() {
		return nextLevelValue;
	}

	public void setNextLevelValue(int nextLevelValue) {
		this.nextLevelValue = nextLevelValue;
	}

	public UserLevel getData() {
		return data;
	}

	public void setData(UserLevel data) {
		this.data = data;
	}


	
}
