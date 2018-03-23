package com.jst.prodution.lane.cmbpay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
 * @Package: com.jst.prodution.lane.cmbpay.serviceBean
 * @ClassName: LaneCMBPayNotifyBean.java
 * @Description: 招行一网通支付通知bean
 *
 * @author: wanghuai
 * @date: 2018年1月17日 上午11:40:54 
 * @version: V1.0
 *
 */
public class LaneCMBPayNotifyBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	/**
	 * 招商支付通知 应答数据
	 */
	private String jsonRequestData;
	
	//出参
	/**
	 * 支付或者签名业务数据
	 */
	private String noticeData;

	public String getJsonRequestData() {
		return jsonRequestData;
	}

	public void setJsonRequestData(String jsonRequestData) {
		this.jsonRequestData = jsonRequestData;
	}

	public String getNoticeData() {
		return noticeData;
	}

	public void setNoticeData(String noticeData) {
		this.noticeData = noticeData;
	}
}
