package com.jst.prodution.acctfront.serviceBean;
/**
 * 账户统一记账接口
 * @author 汤广海
 * 
 */ 
import java.util.List;
import com.jst.prodution.base.bean.BaseBean;

public class AcctFrontUnifyBillingBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	private String busNo;// 交易订单流水号 必输
	private String tradeCode;//账户交易码 必输
	private List<AcctFrontPairingAcct> pairingAccts;//交易双方账户信息
	private Integer currency;// 币别(1-CNY) 必输
	private Integer busTransDate;// 交易日期(8位整形) 必输
	private String limtAmtFlag;//限额标识(限额标识0-限额，1-不限额) 可输
	private String sourceFrom;// 业务来源（1-APP，2-OMS，3-交易核心） 必输
	private String remark;// 备注 可输
	
	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getTradeCode() {
		return tradeCode;
	}

	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}

	public List<AcctFrontPairingAcct> getPairingAccts() {
		return pairingAccts;
	}

	public void setPairingAccts(List<AcctFrontPairingAcct> pairingAccts) {
		this.pairingAccts = pairingAccts;
	}

	public Integer getCurrency() {
		return currency;
	}

	public void setCurrency(Integer currency) {
		this.currency = currency;
	}

	public Integer getBusTransDate() {
		return busTransDate;
	}

	public void setBusTransDate(Integer busTransDate) {
		this.busTransDate = busTransDate;
	}

	public String getLimtAmtFlag() {
		return limtAmtFlag;
	}

	public void setLimtAmtFlag(String limtAmtFlag) {
		this.limtAmtFlag = limtAmtFlag;
	}

	public String getSourceFrom() {
		return sourceFrom;
	}

	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
