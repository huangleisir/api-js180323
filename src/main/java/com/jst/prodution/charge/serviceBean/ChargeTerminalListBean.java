package com.jst.prodution.charge.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 类名: ChargeTerminalListBean</br>
 * 作者: lin
 * 描述: 充电终端列表bean 
 * 创建时间: 2018年3月7日上午11:25:37
 * 版权及版本: Copyright(C)2018 jst版权所有
 */
public class ChargeTerminalListBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<ChargeTerminalDetailBean> pileList; //终端列表

	public List<ChargeTerminalDetailBean> getPileList() {
		return pileList;
	}

	public void setPileList(List<ChargeTerminalDetailBean> pileList) {
		this.pileList = pileList;
	}
	
}
