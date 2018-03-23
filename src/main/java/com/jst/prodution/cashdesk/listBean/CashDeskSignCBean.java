package com.jst.prodution.cashdesk.listBean;

import com.jst.prodution.base.bean.BaseBean;

public class CashDeskSignCBean extends BaseBean{
	private static final long serialVersionUID = 1L;

    private String memberId;

    private String productCode;//支付分类产品编码
    
    private String productName;

    private String channelCode;

    private String sourceFrom;

    private String signDate;

    private String unsignDate;

    private String state;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }
    
	public String getSourceFrom() {
        return sourceFrom;
    }

    public void setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom == null ? null : sourceFrom.trim();
    }

	public String getSignDate() {
		return signDate;
	}

	public void setSignDate(String signDate) {
		this.signDate = signDate;
	}

	public String getUnsignDate() {
		return unsignDate;
	}

	public void setUnsignDate(String unsignDate) {
		this.unsignDate = unsignDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
    
}
