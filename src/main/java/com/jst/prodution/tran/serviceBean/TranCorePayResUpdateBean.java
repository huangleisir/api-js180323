package com.jst.prodution.tran.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class TranCorePayResUpdateBean extends BaseBean {
	private static final long serialVersionUID = 1L;

    private String busNo;

    private String state; //'0-成功，1-支付中，4,关闭';

    private String busType;

    private Long tranFee;

    private String merchantExtenalNo;

    private String payLaneNo; //支付核心

    private String merchantId;

    private String merchantMemberId;

    private String merchantName;
    
    private String payMemberId;

    private String payMemberName;

    private String payMemberMobile;

    private Long tranAmount;

    private Date expiredTime;

    private Date paySuccessTime;

    private String orderName;

    private String orderDes;

//    private String payCerNo;
    
    private String resultNoticeUrl;

    private String resultPageUrl;

    private String sceneCode;

    private String isExpire;//是否已过期
    
    private String payType;//微信支付模式：APP、JSAPI、NATIVE  支付宝支付模式：APP、WAP、NATIVE   捷易付支付模式：H5

    private String remark;
    
    private String errorMsg;

    private Date createTime;

    private Date updateTime;

	private String payChannelId		;//(添加字段)支付渠道号 WeChat:微信，Alipay：支付宝，JYF：捷易付

	private String  payChannelCode	;// 二级支付方式:WeChat: 微信，WeChatXY:微信（兴业），Alipay： 支付宝，YFK：  捷顺通卡，KQ： 银行卡（快钱） ，Union：银联 ，XY： 银行卡（兴业），BAL： 余额
	
	private String  appId ; 
	
	private String discountFlag;//渠道优惠标志，Y:有优惠 N：无优惠
    
	private Long discountAmount;//渠道优惠金额(单位分)
	
//	private String frozenIds;//冻结流水号

	//添加营销系统优惠相关字段
	private String marketingId;//活动ID
	private String discountType;//折扣类型(1-金额,2-比率)
	private String discountValue;//折扣值(如:20或20%)
	private String promoteType;//优惠类型(1-满减,2-满赠)
	private Long payAmount;//实际支付金额(单位:分)
	private Long promoteAmount;//优惠金额(单位:分)
	private String promoteMchId;//优惠承担商户ID
	private String activityJoinNo;//活动流水号

    private String externTransactionId;   //支付宝，微信交易流水号
    
	/*---------------------充值回调更新字段start-----------------------*/
	private String userId; // 用户标识 必输
	private Integer tranDate;// 交易日期
	private String bankCardNo;// 银行账号 必输 充值使用的银行卡号
	private String rechargeWay;//充值方式   03-微信    04-支付宝   05-捷易付(银行卡)
	private Integer cutDate;// 日切
	private String mobile; // 手机号
	private String operUser;// 操作人 可输
	/*---------------------充值回调更新字段end-----------------------*/
	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getIsExpire() {
		return isExpire;
	}

	public void setIsExpire(String isExpire) {
		this.isExpire = isExpire;
	}

	public String getExternTransactionId() {
		return externTransactionId;
	}

	public void setExternTransactionId(String externTransactionId) {
		this.externTransactionId = externTransactionId;
	}

	public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo == null ? null : busNo.trim();
    }
    
    public Date getPaySuccessTime() {
		return paySuccessTime;
	}

	public void setPaySuccessTime(Date paySuccessTime) {
		this.paySuccessTime = paySuccessTime;
	}

	public String getPayChannelCode() {
		return payChannelCode;
	}

	public void setPayChannelCode(String payChannelCode) {
		this.payChannelCode = payChannelCode;
	}

	public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType == null ? null : busType.trim();
    }

    public Long getTranFee() {
        return tranFee;
    }

    public void setTranFee(Long tranFee) {
        this.tranFee = tranFee;
    }


    public String getMerchantExtenalNo() {
        return merchantExtenalNo;
    }

    public void setMerchantExtenalNo(String merchantExtenalNo) {
        this.merchantExtenalNo = merchantExtenalNo == null ? null : merchantExtenalNo.trim();
    }

	public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getMerchantMemberId() {
        return merchantMemberId;
    }

    public void setMerchantMemberId(String merchantMemberId) {
        this.merchantMemberId = merchantMemberId == null ? null : merchantMemberId.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getPayMemberId() {
        return payMemberId;
    }

    public void setPayMemberId(String payMemberId) {
        this.payMemberId = payMemberId == null ? null : payMemberId.trim();
    }

    public String getPayMemberName() {
        return payMemberName;
    }

    public void setPayMemberName(String payMemberName) {
        this.payMemberName = payMemberName == null ? null : payMemberName.trim();
    }

    public String getPayMemberMobile() {
        return payMemberMobile;
    }

    public void setPayMemberMobile(String payMemberMobile) {
        this.payMemberMobile = payMemberMobile == null ? null : payMemberMobile.trim();
    }

    public Long getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(Long tranAmount) {
        this.tranAmount = tranAmount;
    }

    public Date getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Date expiredTime) {
        this.expiredTime = expiredTime;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    public String getOrderDes() {
        return orderDes;
    }

    public void setOrderDes(String orderDes) {
        this.orderDes = orderDes == null ? null : orderDes.trim();
    }

    public String getResultNoticeUrl() {
        return resultNoticeUrl;
    }

    public void setResultNoticeUrl(String resultNoticeUrl) {
        this.resultNoticeUrl = resultNoticeUrl == null ? null : resultNoticeUrl.trim();
    }

    public String getResultPageUrl() {
        return resultPageUrl;
    }

    public void setResultPageUrl(String resultPageUrl) {
        this.resultPageUrl = resultPageUrl == null ? null : resultPageUrl.trim();
    }

    public String getSceneCode() {
        return sceneCode;
    }

    public void setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode == null ? null : sceneCode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	public String getPayChannelId() {
		return payChannelId;
	}

	public void setPayChannelId(String payChannelId) {
		this.payChannelId = payChannelId;
	}

	public String getMarketingId() {
		return marketingId;
	}

	public void setMarketingId(String marketingId) {
		this.marketingId = marketingId;
	}

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(String discountValue) {
		this.discountValue = discountValue;
	}

	public String getPromoteType() {
		return promoteType;
	}

	public void setPromoteType(String promoteType) {
		this.promoteType = promoteType;
	}

	public Long getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public Long getPromoteAmount() {
		return promoteAmount;
	}

	public void setPromoteAmount(Long promoteAmount) {
		this.promoteAmount = promoteAmount;
	}

	public String getPromoteMchId() {
		return promoteMchId;
	}

	public void setPromoteMchId(String promoteMchId) {
		this.promoteMchId = promoteMchId;
	}

	public String getActivityJoinNo() {
		return activityJoinNo;
	}

	public void setActivityJoinNo(String activityJoinNo) {
		this.activityJoinNo = activityJoinNo;
	}

	public String getPayLaneNo() {
		return payLaneNo;
	}

	public void setPayLaneNo(String payLaneNo) {
		this.payLaneNo = payLaneNo;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}
	
	public String getDiscountFlag() {
		return discountFlag;
	}

	public void setDiscountFlag(String discountFlag) {
		this.discountFlag = discountFlag;
	}

	public Long getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(Long discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getTranDate() {
		return tranDate;
	}

	public void setTranDate(Integer tranDate) {
		this.tranDate = tranDate;
	}

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getOperUser() {
		return operUser;
	}

	public void setOperUser(String operUser) {
		this.operUser = operUser;
	}

	public String getRechargeWay() {
		return rechargeWay;
	}

	public void setRechargeWay(String rechargeWay) {
		this.rechargeWay = rechargeWay;
	}

	public Integer getCutDate() {
		return cutDate;
	}

	public void setCutDate(Integer cutDate) {
		this.cutDate = cutDate;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
