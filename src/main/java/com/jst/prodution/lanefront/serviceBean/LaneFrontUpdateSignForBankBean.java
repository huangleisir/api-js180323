package com.jst.prodution.lanefront.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class LaneFrontUpdateSignForBankBean extends BaseBean {
	private static final long serialVersionUID = 1L;

	private String authenflowNo;   //系统流水号（签约请求时填写的客户协议号agrNo）

    private String userId;   //用户标识 必输

    private String userName;//用户姓名

    private String bankcardNo; //银行卡号

    private String cardType; //卡类型

    private String telephone;//银行预留手机号码

    private String verifyNum;  //短信校验码

    private String cardlastfourno; //卡号后4位

//    private String cvv;

    private String expireDate;  //卡有效期

    private String channelCode; //通道编码(001-快钱，002-银联，003-一网通) 必输
    
    private String externalRefNumber;// 外部跟踪编号
    
    private String certNo;   //证件号码（hash值）

    private String certType;  //证件类型 0：身份证
    
    private String noPwdPay;// 免密标识，固定为“N”，表示不开通免密  可输

    private String noticeSerialNo;// 银行通知序号

    private String state; //0-成功，1-失败，2-处理中
    
    public String getAuthenflowNo() {
        return authenflowNo;
    }

    public void setAuthenflowNo(String authenflowNo) {
        this.authenflowNo = authenflowNo == null ? null : authenflowNo.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getBankcardNo() {
        return bankcardNo;
    }

    public void setBankcardNo(String bankcardNo) {
        this.bankcardNo = bankcardNo == null ? null : bankcardNo.trim();
    }

    public String getCardType() {
        return cardType;
    }

    
    public String getNoPwdPay() {
		return noPwdPay;
	}

	public void setNoPwdPay(String noPwdPay) {
		this.noPwdPay = noPwdPay;
	}

	public String getNoticeSerialNo() {
		return noticeSerialNo;
	}

	public void setNoticeSerialNo(String noticeSerialNo) {
		this.noticeSerialNo = noticeSerialNo;
	}

	public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getVerifyNum() {
        return verifyNum;
    }

    public void setVerifyNum(String verifyNum) {
        this.verifyNum = verifyNum == null ? null : verifyNum.trim();
    }

    public String getCardlastfourno() {
        return cardlastfourno;
    }

    public void setCardlastfourno(String cardlastfourno) {
        this.cardlastfourno = cardlastfourno == null ? null : cardlastfourno.trim();
    }


    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate == null ? null : expireDate.trim();
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

	public String getExternalRefNumber() {
		return externalRefNumber;
	}

	public void setExternalRefNumber(String externalRefNumber) {
		this.externalRefNumber = externalRefNumber;
	}

}
