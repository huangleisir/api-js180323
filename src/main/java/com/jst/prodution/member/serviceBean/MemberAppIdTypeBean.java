package com.jst.prodution.member.serviceBean;


import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.member.model.AppidTypePo;

/**
 * MemberAppIdTypeBean class
 * 
 * @author ningxuzhou
 * @date 2018/1/31
 * 查询支付参数交互bean，表t_appid_type
 */
public class MemberAppIdTypeBean extends BaseBean {

    private static final long serialVersionUID = 1L;

    /**
     *  分配给商户的appId 
     */
    private String appId;

    /**
     *  app类型 1 内部 2 外部 
     */
    private String appType;

    /**
     *  渠道号 
     */
    private String regChannel;

    /**
     *  APPkey 
     */
    private String appKey;

    /**
     *  商户号 
     */
    private String merchantId;

    /**
     *   
     */
    private String jtcOpenurl;

    /**
     *  商户名 
     */
    private String merchantName;

    /**
     *  应用类型 
     */
    private String appPattern;
    
    private List<AppidTypePo> resultList;
    
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getRegChannel() {
        return regChannel;
    }

    public void setRegChannel(String regChannel) {
        this.regChannel = regChannel;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getJtcOpenurl() {
        return jtcOpenurl;
    }

    public void setJtcOpenurl(String jtcOpenurl) {
        this.jtcOpenurl = jtcOpenurl;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getAppPattern() {
        return appPattern;
    }

    public void setAppPattern(String appPattern) {
        this.appPattern = appPattern;
    }

    public List<AppidTypePo> getResultList() {
        return resultList;
    }

    public void setResultList(List<AppidTypePo> resultList) {
        this.resultList = resultList;
    }

}
