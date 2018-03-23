package com.jst.prodution.push.serviceBean;

import java.util.Map;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
 * 
 * @Package: com.jst.prodution.push.serviceBean  
 * @ClassName: NotificationlBean 
 * @Description: 通知推送的bean，直接显示到通知栏（非透传消息）
 *
 * @author: Administrator 
 * @date: 2017年2月10日 上午10:53:08 
 * @version V1.0
 */
public class PushTemplateMsgBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String appid;			//

    private String clientId	;             //String	N	个推clientId，客户端sdk初始化返回
	
	private String userid	;             //String	N	用户标识,用于拉取用户推送记录列表
	
	private String openId	;             //String	N	openId
	
	private String templateCode	;             //String	Y	消息模板编号
	
	private Map<String, Object> templateData	;             //map	N	
	
	private String terminalType = "APP"	;             //String	Y	默认APP，APP、WX、APPWX
	
	
	boolean cache = true ;  

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTemplateCode() {
		return templateCode;
	}

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public Map<String, Object> getTemplateData() {
		return templateData;
	}

	public void setTemplateData(Map<String, Object> templateData) {
		this.templateData = templateData;
	}

	public String getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

	public boolean isCache() {
		return cache;
	}

	public void setCache(boolean cache) {
		this.cache = cache;
	}
	
	
	
}
