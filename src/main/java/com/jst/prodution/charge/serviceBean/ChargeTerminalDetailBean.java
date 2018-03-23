package com.jst.prodution.charge.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 类名: ChargeTerminalDetailBean</br>
 * 作者: lin
 * 描述: 充电终端明细bean 
 * 创建时间: 2018年3月7日上午11:25:37
 * 版权及版本: Copyright(C)2018 jst版权所有
 */
public class ChargeTerminalDetailBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String equipmentid;
	private String equipmenttype;
	private String equipmentlng;
	private String equipmentlat;
	private String power;  
	private String equipmentname;
	private String current;
	/** 充电设备状态 :0：离网
	1：空闲
	2：占用（未充电）
	3：占用（充电中）
	4：占用（预约锁定）
	255：故障
	*/
	private String status;
	/**1：家用插座（模式2）
	2：交流接口插座（模式3，连接方式B ）
	3：交流接口插头（带枪线，模式3，连接方式C）
	4：直流接口枪头（带枪线，模式4）
	5：无线充电座
	6：其他 */
	private String connectortype; 
	private String nationalstandard; //国标  1:2011;2:2015
	private String parkno;
	private String parkstatus;
	private String lockstatus;
	private String stationid;
	private String stationname;
	
	
	public String getEquipmentid() {
		return equipmentid;
	}
	public void setEquipmentid(String equipmentid) {
		this.equipmentid = equipmentid;
	}
	public String getEquipmenttype() {
		return equipmenttype;
	}
	public void setEquipmenttype(String equipmenttype) {
		this.equipmenttype = equipmenttype;
	}
	public String getEquipmentlng() {
		return equipmentlng;
	}
	public void setEquipmentlng(String equipmentlng) {
		this.equipmentlng = equipmentlng;
	}
	public String getEquipmentlat() {
		return equipmentlat;
	}
	public void setEquipmentlat(String equipmentlat) {
		this.equipmentlat = equipmentlat;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getEquipmentname() {
		return equipmentname;
	}
	public void setEquipmentname(String equipmentname) {
		this.equipmentname = equipmentname;
	}
	public String getCurrent() {
		return current;
	}
	public void setCurrent(String current) {
		this.current = current;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public String getConnectortype() {
		return connectortype;
	}
	public void setConnectortype(String connectortype) {
		this.connectortype = connectortype;
	}
	public String getNationalstandard() {
		return nationalstandard;
	}
	public void setNationalstandard(String nationalstandard) {
		this.nationalstandard = nationalstandard;
	}
	public String getParkno() {
		return parkno;
	}
	public void setParkno(String parkno) {
		this.parkno = parkno;
	}
	public String getParkstatus() {
		return parkstatus;
	}
	public void setParkstatus(String parkstatus) {
		this.parkstatus = parkstatus;
	}
	public String getLockstatus() {
		return lockstatus;
	}
	public void setLockstatus(String lockstatus) {
		this.lockstatus = lockstatus;
	}
	
}
