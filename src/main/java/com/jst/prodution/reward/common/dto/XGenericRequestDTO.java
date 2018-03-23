package com.jst.prodution.reward.common.dto;


public class XGenericRequestDTO extends BaseDTO {


	private static final long serialVersionUID = -4332581260011197442L;

	private String reqSn;
	
	private String transCode;

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getReqSn() {
		return reqSn;
	}

	public void setReqSn(String reqSn) {
		this.reqSn = reqSn;
	}
	

}
