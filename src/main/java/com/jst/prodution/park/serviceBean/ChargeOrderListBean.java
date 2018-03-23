/*
* Copyright (c) 2015-2018 SHENZHEN JST SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.park.serviceBean  
 * @ClassName: ChargeOrderListBean 
 * @Description: 订单
 *
 * @author: hewen 
 * @date: 2018年1月19日 上午9:29:02 
 * @version V1.0 
 */
public class ChargeOrderListBean extends BaseBean{
	private static final long serialVersionUID = 1L;

	private String  pagesize;
	
	private String pageno;
	
	private String userId;
	
	private String ordstatus;
	
	private String ordid;
	
	private String ordamt;
	
	private String mchntid;
	
	private String mchntname;
	
	private String parkid;
	
	private String parkname;
	
	private String csno;//电桩SN
	
	private String starttime;
	
	private String endtime;  // 结束时间
	
	private String chargetimelen; // 充电总时长
	
	private String chargeenergy; // 电量
	
	private String parktype ; //车场类型 ;
	
	private String ifsupporthold ; // 是否支持代扣 
	
	private String respTime; // 应答时间 yyyyMMddHHmmss
	
	private List<ChargeOrderListBean> ordlist;


	public String getPagesize() {
		return pagesize;
	}

	public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}

	public String getPageno() {
		return pageno;
	}

	public void setPageno(String pageno) {
		this.pageno = pageno;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOrdstatus() {
		return ordstatus;
	}

	public void setOrdstatus(String ordstatus) {
		this.ordstatus = ordstatus;
	}

	public String getOrdid() {
		return ordid;
	}

	public void setOrdid(String ordid) {
		this.ordid = ordid;
	}

	public String getOrdamt() {
		return ordamt;
	}

	public void setOrdamt(String ordamt) {
		this.ordamt = ordamt;
	}

	public String getMchntid() {
		return mchntid;
	}

	public void setMchntid(String mchntid) {
		this.mchntid = mchntid;
	}

	public String getMchntname() {
		return mchntname;
	}

	public void setMchntname(String mchntname) {
		this.mchntname = mchntname;
	}

	public String getParkid() {
		return parkid;
	}

	public void setParkid(String parkid) {
		this.parkid = parkid;
	}

	public String getParkname() {
		return parkname;
	}

	public void setParkname(String parkname) {
		this.parkname = parkname;
	}

	public String getCsno() {
		return csno;
	}

	public void setCsno(String csno) {
		this.csno = csno;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getChargetimelen() {
		return chargetimelen;
	}

	public void setChargetimelen(String chargetimelen) {
		this.chargetimelen = chargetimelen;
	}

	public String getChargeenergy() {
		return chargeenergy;
	}

	public void setChargeenergy(String chargeenergy) {
		this.chargeenergy = chargeenergy;
	}

	
	public List<ChargeOrderListBean> getOrdlist() {
		return ordlist;
	}

	public void setOrdlist(List<ChargeOrderListBean> ordlist) {
		this.ordlist = ordlist;
	}

	public String getParktype() {
		return parktype;
	}

	public void setParktype(String parktype) {
		this.parktype = parktype;
	}

	public String getIfsupporthold() {
		return ifsupporthold;
	}

	public void setIfsupporthold(String ifsupporthold) {
		this.ifsupporthold = ifsupporthold;
	}

	public String getRespTime() {
		return respTime;
	}

	public void setRespTime(String respTime) {
		this.respTime = respTime;
	}
	
}
