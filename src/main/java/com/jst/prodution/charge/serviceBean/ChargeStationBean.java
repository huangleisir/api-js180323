package com.jst.prodution.charge.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 类名: ChargeStationListBean</br>
 * 作者: lin
 * 描述: 充电站列表bean 
 * 创建时间: 2018年3月7日上午11:26:10
 * 版权及版本: Copyright(C)2018 jst版权所有
 */
public class ChargeStationBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String gps;
	private String range;
	private String type;
	private String sort;
	private String area;
	private String key;
	
	private String stationid; //电站编号
	private String stationname; //充电站名称
	private String areacode; //充电站省市辖区编码
	private String address; //详细地址
	private String stationtype; //站点类型
	
	/** 站点状态 -> 1：公共50：个人;100：公交（专用）;101：环卫（专用）;
	 * 102：物流（专用）;103：出租车（专用）;255：其他 
	 * */
	private String stationstatus; 
	private String parknums;//车位数量
	private String stationlng; //经度
	private String stationlat; //纬度
	private String pictures; //图片  url访问路径
	private String countrycode; //充电站国家代码 :比如CN
	private String stationtel; //站点电话: 能够联系场站工作人员进行协助的联系电话
	private String servicetel; //服务电话: 平台服务电话，例如400的电话
	private String siteguide;//站点引导 :描述性文字，用于引导车主找到充电车位
	private String construction;//建设场所 
	private String matchcars;//使用车型描述 -描述该站点接受的车大小以及类型，如大巴、物流车、私家乘用车、出租车等
	private String parkinfo; //车位楼层以及数量信息
	private String businehours; //营业时间:营业时间描述
	private int balancenum; //终端空闲总数
	private int equipmentnum;  //终端总数
	private String electricityfee; //充电费描述
	private String servicefee; //服务费率描述
	private String parkfee;  // 停车费率描述
	private String elecprice;  // 充电费单价
	private String seviceprice;  // 服务费单价
	private List<ChargeStationBean> parklist ; 
	
	public String getGps() {
		return gps;
	}
	public void setGps(String gps) {
		this.gps = gps;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getStationid() {
		return stationid;
	}
	public void setStationid(String stationid) {
		this.stationid = stationid;
	}
	public String getStationname() {
		return stationname;
	}
	public void setStationname(String stationname) {
		this.stationname = stationname;
	}
	public String getAreacode() {
		return areacode;
	}
	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStationtype() {
		return stationtype;
	}
	public void setStationtype(String stationtype) {
		this.stationtype = stationtype;
	}
	public String getStationstatus() {
		return stationstatus;
	}
	public void setStationstatus(String stationstatus) {
		this.stationstatus = stationstatus;
	}
	public String getParknums() {
		return parknums;
	}
	public void setParknums(String parknums) {
		this.parknums = parknums;
	}
	public String getStationlng() {
		return stationlng;
	}
	public void setStationlng(String stationlng) {
		this.stationlng = stationlng;
	}
	public String getStationlat() {
		return stationlat;
	}
	public void setStationlat(String stationlat) {
		this.stationlat = stationlat;
	}
	public String getPictures() {
		return pictures;
	}
	public void setPictures(String pictures) {
		this.pictures = pictures;
	}
	public int getBalancenum() {
		return balancenum;
	}
	public void setBalancenum(int balancenum) {
		this.balancenum = balancenum;
	}
	public int getEquipmentnum() {
		return equipmentnum;
	}
	public void setEquipmentnum(int equipmentnum) {
		this.equipmentnum = equipmentnum;
	}
	public String getElectricityfee() {
		return electricityfee;
	}
	public void setElectricityfee(String electricityfee) {
		this.electricityfee = electricityfee;
	}
	public String getServicefee() {
		return servicefee;
	}
	public void setServicefee(String servicefee) {
		this.servicefee = servicefee;
	}
	public String getParkfee() {
		return parkfee;
	}
	public void setParkfee(String parkfee) {
		this.parkfee = parkfee;
	}
	public List<ChargeStationBean> getParklist() {
		return parklist;
	}
	public void setParklist(List<ChargeStationBean> parklist) {
		this.parklist = parklist;
	}
	public String getElecprice() {
		return elecprice;
	}
	public void setElecprice(String elecprice) {
		this.elecprice = elecprice;
	}
	public String getSeviceprice() {
		return seviceprice;
	}
	public void setSeviceprice(String seviceprice) {
		this.seviceprice = seviceprice;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getStationtel() {
		return stationtel;
	}
	public void setStationtel(String stationtel) {
		this.stationtel = stationtel;
	}
	public String getServicetel() {
		return servicetel;
	}
	public void setServicetel(String servicetel) {
		this.servicetel = servicetel;
	}
	public String getSiteguide() {
		return siteguide;
	}
	public void setSiteguide(String siteguide) {
		this.siteguide = siteguide;
	}
	public String getConstruction() {
		return construction;
	}
	public void setConstruction(String construction) {
		this.construction = construction;
	}
	public String getMatchcars() {
		return matchcars;
	}
	public void setMatchcars(String matchcars) {
		this.matchcars = matchcars;
	}
	public String getParkinfo() {
		return parkinfo;
	}
	public void setParkinfo(String parkinfo) {
		this.parkinfo = parkinfo;
	}
	public String getBusinehours() {
		return businehours;
	}
	public void setBusinehours(String businehours) {
		this.businehours = businehours;
	}
	
}
