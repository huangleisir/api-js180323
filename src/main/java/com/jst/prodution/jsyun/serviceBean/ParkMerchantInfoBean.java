package com.jst.prodution.jsyun.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class ParkMerchantInfoBean extends BaseBean{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 记录编号
     */
    private String id;

    /**
     * 停车场id
     */
    private String parkId;

    /**
     * 商户id
     */
    private String merchantId;

	private List<ParkMerchantInfoBean> parkMerchantList;//停车场列表
	
	
	
	public String getParkId() {
		return parkId;
	}

	public void setParkId(String parkId) {
		this.parkId = parkId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<ParkMerchantInfoBean> getParkMerchantList() {
		return parkMerchantList;
	}

	public void setParkMerchantList(List<ParkMerchantInfoBean> parkMerchantList) {
		this.parkMerchantList = parkMerchantList;
	}

	
    
}