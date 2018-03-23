package com.jst.prodution.reward.common.enums;

public enum TransEnum {
	TRANS_RT0001("RT0001","签到任务激励插入"),
	TRANS_RT0002("RT0002","分享任务激励插入"),
	TRANS_RT0003("RT0003","升级动画归0"),
	
	TRANS_RQ0001("RQ0001","激励记录分页查询"),
	TRANS_RQ0002("RQ0002","今日是否已经签到"),
	TRANS_RQ0003("RQ0003","今日是否已经分享"),
	TRANS_RQ0004("RQ0004","显示签到配置"),
//	TRANS_RQ0004("RQ0004","今日是否已经支付"),
	TRANS_RQ0005("RQ0005","用户激励等级配置查询"),
	TRANS_RQ0006("RQ0006","用户激励等级查询"),
	TRANS_RQ0011("RQ0011","展示分享APP得好豆的值"),
	TRANS_RQ0012("RQ0012","展示今日是否签到得好豆的值"),
	TRANS_RQ0013("RQ0013","查询好豆余额");

	
	private String code;
	private String msg;

	private TransEnum(String code,String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return this.code;
	}

	public String getMsg() {
		return this.msg;
	}

}
