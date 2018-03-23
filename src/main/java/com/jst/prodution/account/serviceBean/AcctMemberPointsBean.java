package com.jst.prodution.account.serviceBean;

import java.util.Date;

public class AcctMemberPointsBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 交易明细流水号
	 */
	private String id;
	/**
	 * 账户标识
	 */
	private String acctId;
	/**
	 * 会员标识
	 */
	private String userId;
	/**
	 * 账户名称
	 */
	private String acctName;
	/**
	 * 业务来源（1-APP,2-OMS）
	 */
	private Integer sourceFrom;
	/**
	 * 积分数
	 */
	private Long points;
	/**
	 * 操作类型(0-增加积分,1-减少积分)
	 */
	private Integer operType;
	/**
	 * 业务类型(0-支付,1-注册,2-登陆,3-签到,4-消费返现,5-理财,6-退款,7-其他)
	 */
	private Integer busTranType;
	/**
	 * 交易流水号
	 */
	private String busNo;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 创建人（系统默认“99”，其它为运营人员ID号）
	 */
	private String createUser;
	/**
	 * 最后更新人
	 */
	private String updateUser;
	/**
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 最后更新时间
	 */
	private String updateTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAcctId() {
		return acctId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public Integer getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(Integer sourceFrom) {
		this.sourceFrom = sourceFrom;
	}
	
	public Long getPoints() {
		return points;
	}
	public void setPoints(Long points) {
		this.points = points;
	}
	public Integer getOperType() {
		return operType;
	}
	public void setOperType(Integer operType) {
		this.operType = operType;
	}
	public Integer getBusTranType() {
		return busTranType;
	}
	public void setBusTranType(Integer busTranType) {
		this.busTranType = busTranType;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
}
