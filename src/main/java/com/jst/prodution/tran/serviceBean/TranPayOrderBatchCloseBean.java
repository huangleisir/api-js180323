package com.jst.prodution.tran.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 *@description:
 *@author  widon
 *@date: 2017年10月31日 下午3:21:13
 *@since: JDK 1.8
 *@version:V1.0.0
 */
public class TranPayOrderBatchCloseBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	
	private List<TranCorePayOrderBean> payOrderList; //需要关闭的订单list
    private String closeType;       //关闭类型   1-主动关单,2-交易处理过期关单,3-定时批量关单
    private String remark;    //备注
	private String merchantExtenalNo;//商户订单流水  与busNo二选一

	private String busNo;//交易流水

    public List<TranCorePayOrderBean> getPayOrderList() {
        return payOrderList;
    }
    public void setPayOrderList(List<TranCorePayOrderBean> payOrderList) {
        this.payOrderList = payOrderList;
    }
    public String getCloseType() {
        return closeType;
    }
    public void setCloseType(String closeType) {
        this.closeType = closeType;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
	public String getMerchantExtenalNo() {
		return merchantExtenalNo;
	}
	public void setMerchantExtenalNo(String merchantExtenalNo) {
		this.merchantExtenalNo = merchantExtenalNo;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	
}
