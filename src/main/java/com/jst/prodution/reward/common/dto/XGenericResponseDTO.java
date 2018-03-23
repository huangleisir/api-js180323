package com.jst.prodution.reward.common.dto;

public class XGenericResponseDTO extends BaseDTO{

	
	 /**
	 * 
	 */
	private static final long serialVersionUID = -2528165705152090746L;

	/**
     * 请求流水号
     */
    private String reqSn;
    /**
     * 一级返回码
     */
    private String respCode;
    /**
     * 返回码描述
     */
    private String respMsg;

    public XGenericResponseDTO() {
	}

	public XGenericResponseDTO(String reqSn, String respCode, String respMsg) {
		super();
		this.reqSn = reqSn;
		this.respCode = respCode;
		this.respMsg = respMsg;
	}


	public String getReqSn() {
		return reqSn;
	}


	public void setReqSn(String reqSn) {
		this.reqSn = reqSn;
	}


	public String getRespCode() {
		return respCode;
	}


	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}


	public String getRespMsg() {
		return respMsg;
	}


	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
    
    

}
