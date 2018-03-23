package com.jst.prodution.reward.common.dto.req;

import com.jst.prodution.reward.common.dto.XGenericRequestDTO;

public class RQ0001ReqDto extends XGenericRequestDTO{
	
	/**
	* @Fields 加分还是减分分数类型，加分还是减分，加分 add ，减分 sub
	*/
	private String scoreType;
	
	/**
	* @Fields 用户Id
	*/
	private String userId;
	/**
	* @Fields 当前页默认为1
	*/
	private Integer pageNo = 1 ;
	
	/**
	* @Fields 每页显示条数
	*/
	private Integer pageSize = 20 ;

	public String getScoreType() {
		return scoreType;
	}

	public void setScoreType(String scoreType) {
		this.scoreType = scoreType;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
	
}
