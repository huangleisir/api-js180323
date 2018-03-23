package com.jst.prodution.reward.common.enums;


public enum RespEnum {
	
	RESP_CODE_000000("000000","交易成功"),
	RESP_CODE_000001("000001","交易失败"),
	
	RESP_CODE_100001("100001","请求参数为空"),
	RESP_CODE_100002("100002","基础参数校验未通过"),
	RESP_CODE_100003("100003","请求参数不正确"),
	RESP_CODE_100004("100004","请求流水号为空"),
	RESP_CODE_100005("100005","请求参数交易码错误"),
	RESP_CODE_100006("100006","订单号不存在"),
	RESP_CODE_100007("100007","订单号重复"),
	RESP_CODE_100008("100008","短信验证码错误"),
	RESP_CODE_100010("100010","流水号重复"),
	RESP_CODE_100011("100011","只能绑定借记卡"),
	RESP_CODE_100012("100012","短信验证码发送次数过多，请稍后再试"),
	RESP_CODE_100013("100013","手机号码有误"),
	RESP_CODE_100014("100014","短信验证码发送间隔太短，请稍后再试"),
	RESP_CODE_100015("100015","请求流水号长度不对"),
	RESP_CODE_100016("100016","交易码不对"),
	RESP_CODE_100018("100018","调用其他系统异常"),
	RESP_CODE_100017("100017","今日已经签到过"),
	RESP_CODE_100019("100019","今日已经分享过"),
	RESP_CODE_200001("200001","用户不存在"),
	RESP_CODE_200002("200002","账户不存在"),
	RESP_CODE_200003("200003","交易密码错误"),
	RESP_CODE_200004("200004","账户被锁定"),
	RESP_CODE_200005("200005","账户余额不足"),
	RESP_CODE_200006("200006","资金账户已开通！"),
	RESP_CODE_300001("300001","创建用户私钥失败"),
	
	RESP_CODE_900001("900001","非法交易"),
	RESP_CODE_900002("900002","查询数据为空"),
	RESP_CODE_999999("999999","系统异常");
	
	private String code;
	private String msg;

	private RespEnum(String code,String msg) {
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
