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
 * @ClassName: ChargeOrderDetailBean 
 * @Description: 订单详情
 *
 * @author: hewen 
 * @date: 2018年1月18日 下午4:51:41 
 * @version V1.0 
 */
public class ChargeOrderDetailBean extends BaseBean{
  
	private static final long serialVersionUID = 1L;

	private String ordid ;
	
	private String userid;
	
	/**
	 *  1:预处理状态（直流桩，建议APP忽略该状态，不进行逻辑处理）
     *  2:等待充电状态（直流桩）
     *  3:充电状态
     *   4:停车状态
     *  5:预约状态
     *  6:充电完成状态
     *  7:订单关闭
     * 8:等待外部平台付款确认，当前状态订单未关闭
	 */
	private String ordstatus;
	/**
	 * 总金额 分
	 */
	private String ordamt ;
	
	/**
	 * 充电金额
	 */
	private String elecfee;
	
	/**
	 * 服务费
	 */
	private String serverfee;
	
	/**
	 * 商户ID
	 */
	private String mchntid ;
	
	/**
	 * 商户名称
	 */
	private String mchntname;
	
	/**
	 * 停车场名称 
	 */
	private String parkname;
	
	private String parkid;
	
	//是否完成充电	true-是；false-否
	private String finish;
	//预约保留时长
	private String retain ;
	
	//电桩SN
	private String csno;
	//电桩位置
	private String alias;
	
	private String starttime;
	
	private String endtime;
	//充电总时长（单位：分钟）
	private String chargetimelen;
	//电量（单位：0.001 kw/h）
	private String chargeenergy;
	//充电桩编号
	private String stationid ;
	
    private String parktype ; //车场类型 01-路内停车场；02-室内停车场；;
	
	private String ifsupporthold ; // 是否支持代扣  0：不支持 1：支持
	
	private List<ChargeOrderTranFlowBean> ordlist; //支付流水列表
	
	private String overtime ; //订单有效时间
	
	private String payreqssn ; //停车支付充电订单请求流水号
	
	private String payreqtype; //停车支付充电订单请求流水号
	
	private String payStatus  ;// 0-初始化，1-成功，2-失败,4-超时关闭
	
	private String stationname ;//充电站名称
	private String stationmchntid ;//电站商户号(结算商户号)
	private String type ; //电桩类型（内容格式详见下面备注信息）
	private String addr ;
	private String parktimelen ; //停车总时长（单位：分钟）
	private String lonlat ; //电站坐标（格式同“获取电站列表”接口中的坐标字段）
	private String category ; //分类（注：和type有所不同，此字段表示电桩类别的大类，较为笼统；type表示详细类型）
	
	private String respTime; // 应答时间 yyyyMMddHHmmss
	private String  endreason ;//充电结束原因 
	public String getPayreqtype() {
		return payreqtype;
	}
	public void setPayreqtype(String payreqtype) {
		this.payreqtype = payreqtype;
	}
	public String getPayreqssn() {
		return payreqssn;
	}
	public void setPayreqssn(String payreqssn) {
		this.payreqssn = payreqssn;
	}
	public String getOvertime() {
		return overtime;
	}
	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}
	public String getParkid() {
		return parkid;
	}
	public void setParkid(String parkid) {
		this.parkid = parkid;
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
	public String getOrdid() {
		return ordid;
	}
	public void setOrdid(String ordid) {
		this.ordid = ordid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getOrdstatus() {
		return ordstatus;
	}
	public void setOrdstatus(String ordstatus) {
		this.ordstatus = ordstatus;
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
	public String getParkname() {
		return parkname;
	}
	public void setParkname(String parkname) {
		this.parkname = parkname;
	}
	public String getFinish() {
		return finish;
	}
	public void setFinish(String finish) {
		this.finish = finish;
	}
	public String getRetain() {
		return retain;
	}
	public void setRetain(String retain) {
		this.retain = retain;
	}
	public String getCsno() {
		return csno;
	}
	public void setCsno(String csno) {
		this.csno = csno;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
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
	public String getStationid() {
		return stationid;
	}
	public void setStationid(String stationid) {
		this.stationid = stationid;
	}
	public List<ChargeOrderTranFlowBean> getOrdlist() {
		return ordlist;
	}
	public void setOrdlist(List<ChargeOrderTranFlowBean> ordlist) {
		this.ordlist = ordlist;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getRespTime() {
		return respTime;
	}
	public void setRespTime(String respTime) {
		this.respTime = respTime;
	}
	public String getElecfee() {
		return elecfee;
	}
	public void setElecfee(String elecfee) {
		this.elecfee = elecfee;
	}
	public String getServerfee() {
		return serverfee;
	}
	public void setServerfee(String serverfee) {
		this.serverfee = serverfee;
	}
	public String getStationname() {
		return stationname;
	}
	public void setStationname(String stationname) {
		this.stationname = stationname;
	}
	public String getStationmchntid() {
		return stationmchntid;
	}
	public void setStationmchntid(String stationmchntid) {
		this.stationmchntid = stationmchntid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getParktimelen() {
		return parktimelen;
	}
	public void setParktimelen(String parktimelen) {
		this.parktimelen = parktimelen;
	}
	public String getLonlat() {
		return lonlat;
	}
	public void setLonlat(String lonlat) {
		this.lonlat = lonlat;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getEndreason() {
		return endreason;
	}
	public void setEndreason(String endreason) {
		this.endreason = endreason;
	}
	
}
