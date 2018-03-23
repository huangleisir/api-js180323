package com.jst.prodution.account.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class AcctUpdMemberPointsBean extends BaseBean {
	private static final long serialVersionUID = 1L;

	private String acctId; // 会员积分账户(若为空,则会员标识必送)
	private String userId;// 会员标识 可选(若为空,则会员积分账户必送)
	private String acctName;// 账户名称 可选
	private Integer sourceFrom;// 业务来源可选(1-APP,2-OMS)
	private Long points;// 积分数 必输
	private Integer operType;// 操作类型 必输(0-增加积分,1-减少积分)
	private Integer busTranType;// 业务类型 可选(0-支付,1-注册,2-登陆,3-签到,4-消费返现,5-理财,6-退款,7-其他)
	private String busNo;// 交易流水号可选(交易核心订单流水号)
	private String remark;// 备注 可选
	private String createUser;// 创建人 可选(系统默认“99”，其它为运营人员ID号)
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

}
