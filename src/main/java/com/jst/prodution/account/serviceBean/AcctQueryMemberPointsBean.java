package com.jst.prodution.account.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class AcctQueryMemberPointsBean extends BaseBean {
	
	private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 开始时间
	 */
	private Date startCreateTime;
	/**
	 * 结束时间
	 */
	private Date endCreateTime;
	/**
	 * 积分消费明细
	 */
	private List<AcctMemberPointsBean> acctMemberPointsList;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getStartCreateTime() {
		return startCreateTime;
	}
	public void setStartCreateTime(Date startCreateTime) {
		this.startCreateTime = startCreateTime;
	}
	public Date getEndCreateTime() {
		return endCreateTime;
	}
	public void setEndCreateTime(Date endCreateTime) {
		this.endCreateTime = endCreateTime;
	}
	public List<AcctMemberPointsBean> getAcctMemberPointsList() {
		return acctMemberPointsList;
	}
	public void setAcctMemberPointsList(List<AcctMemberPointsBean> acctMemberPointsList) {
		this.acctMemberPointsList = acctMemberPointsList;
	}
}
