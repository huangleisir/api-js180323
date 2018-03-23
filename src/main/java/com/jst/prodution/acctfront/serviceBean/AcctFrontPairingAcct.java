package com.jst.prodution.acctfront.serviceBean;

public class AcctFrontPairingAcct {
	private String acctId;// 发起账号 发起账号、发起会员号+发起账户类型两者二选一必填(交易时优先选择发起账号)
	private String userId;// 发起会员号 发起账号为空时必填
	private String acctName;// 可输
	private String acctType;// 发起账号类型 发起账号为空时必填
	private String oppAcctId;// 对方账户标识,会员账户系统中所对应的账号 可输
	private String oppUserId;// 对方客户标识,客户ID(会员号) 可输
	private String oppAcctName;// 对方账户名称,账户真实姓名 可输
	private String oppAcctType;// 对方账户类型(01-基本户) 可输
	private Long tranAmount;// 交易金额(单位为人民币分) 必输

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

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public String getOppAcctId() {
		return oppAcctId;
	}

	public void setOppAcctId(String oppAcctId) {
		this.oppAcctId = oppAcctId;
	}

	public String getOppUserId() {
		return oppUserId;
	}

	public void setOppUserId(String oppUserId) {
		this.oppUserId = oppUserId;
	}

	public String getOppAcctName() {
		return oppAcctName;
	}

	public void setOppAcctName(String oppAcctName) {
		this.oppAcctName = oppAcctName;
	}

	public String getOppAcctType() {
		return oppAcctType;
	}

	public void setOppAcctType(String oppAcctType) {
		this.oppAcctType = oppAcctType;
	}

	public Long getTranAmount() {
		return tranAmount;
	}

	public void setTranAmount(Long tranAmount) {
		this.tranAmount = tranAmount;
	}
}
