package com.jst.prodution.reward.common.dto.resp;

import com.jst.prodution.reward.common.dto.XGenericResponseDTO;
import com.jst.prodution.reward.serviceBean.CommonConfiguration;

public class RQ0012RespDto extends XGenericResponseDTO{
	
	/**
	* @Fields 签到所获得的分数
	*/
	private int score;
	
	/**
	* @Fields 今日是否已经签到
	*/
	private int state;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	

}
