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

package com.jst.prodution.park.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.park.serviceBean  
 * @ClassName: ChargeEndBean 
 * @Description: 充电结束  
 *
 * @author: hewen 
 * @date: 2018年1月18日 下午2:09:20 
 * @version V1.0 
 */
public class ChargeEndBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	/**  sn 号   */
	private String  sn;
	/** 订单号   */
	private String ordid;
	
	/**
	 * 用户id
	 */
	private String userId;

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getOrdid() {
		return ordid;
	}

	public void setOrdid(String ordid) {
		this.ordid = ordid;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
