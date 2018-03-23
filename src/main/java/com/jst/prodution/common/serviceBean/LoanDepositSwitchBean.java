/*
* Copyright (c) 2015-2018 SHENZHEN JST SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
/*
* Copyright (c) 2016-2020 SHENZHEN JST SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/

package com.jst.prodution.common.serviceBean;

import com.jst.prodution.base.bean.BaseBean;


public class LoanDepositSwitchBean extends BaseBean{

	@Override
    public String toString() {
        return "LoanDepositSwitchBean [id=" + id + ", loanTotalStatus=" + loanTotalStatus + ", depositTotalStatus="
                + depositTotalStatus + ", mobile=" + mobile + ", loanStatus=" + loanStatus + ", depositStatus="
                + depositStatus + ", version=" + version + ", deviceType=" + deviceType + ", status=" + status + "]";
    }

    private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String loanTotalStatus;//贷款总开关0 关 1开
	
	private String depositTotalStatus;//理财总开关0 关 1开
	
	private String mobile;//白名单手机号
	
	private String loanStatus;//贷款开关0 关 1开
	
	private String depositStatus;//理财开关0 关 1开
	
    private String version;//版本号
    
    private String deviceType;//设备类型 1 安卓 2  ios
    
    private String status;//版本号开关 0 关 1开
	
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoanTotalStatus() {
        return loanTotalStatus;
    }

    public void setLoanTotalStatus(String loanTotalStatus) {
        this.loanTotalStatus = loanTotalStatus;
    }

    public String getDepositTotalStatus() {
        return depositTotalStatus;
    }

    public void setDepositTotalStatus(String depositTotalStatus) {
        this.depositTotalStatus = depositTotalStatus;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public String getDepositStatus() {
        return depositStatus;
    }

    public void setDepositStatus(String depositStatus) {
        this.depositStatus = depositStatus;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }


	
	
}
