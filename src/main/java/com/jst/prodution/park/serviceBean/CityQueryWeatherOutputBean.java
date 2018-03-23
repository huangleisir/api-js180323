/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.io.Serializable;

import com.jst.prodution.base.bean.BaseBean;

public class CityQueryWeatherOutputBean extends BaseBean {
	private static final long serialVersionUID=1L;
	
	private String cityName;//城市名称
	
	private String cityCode;//城市编号
	
	private String lat;//经度
	
	private String lng;//纬度
	
	private String wendu;//温度
	
	private String weather;//天气情况
	
	private String weathercode;//天气对应code
	
	private String humidity;//湿度
	
	private String WD;//风向
	
	private String WS;//风力
	
	private String aqi;//空气质量值
	
	private String aqidesc;//空气状况
	                       /*一级  优	可多参加户外活动呼吸新鲜空气
                           51-100	二级  良	除少数对某些污染物特别容易过敏的人群外，其他人群可以正常进行室外活动。
                           101-150	三级  轻度污染	敏感人群需减少体力消耗较大的户外活动
                           151-200	四级  中度污染	敏感人群应尽量减少外出，一般人群适当减少户外运动
                           201-300	五级  重度污染	敏感人群应停止户外运动，一般人群尽量减少户外运动
                           >300	六级  严重污染	除有特殊需要的人群外，尽量不要留在室外*/
	
	
	

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getWendu() {
		return wendu;
	}

	public void setWendu(String wendu) {
		this.wendu = wendu;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getWeathercode() {
		return weathercode;
	}

	public void setWeathercode(String weathercode) {
		this.weathercode = weathercode;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getWD() {
		return WD;
	}

	public void setWD(String wD) {
		WD = wD;
	}

	public String getWS() {
		return WS;
	}

	public void setWS(String wS) {
		WS = wS;
	}

	public String getAqi() {
		return aqi;
	}

	public void setAqi(String aqi) {
		this.aqi = aqi;
	}

	public String getAqidesc() {
		return aqidesc;
	}

	public void setAqidesc(String aqidesc) {
		this.aqidesc = aqidesc;
	}

	
}
