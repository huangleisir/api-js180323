/*
* Copyright (c) 2015-2018 SHENZHEN JST SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/

package com.jst.prodution.member.dubbo.service;

import java.util.List;
import java.util.Map;

import com.jst.prodution.common.serviceBean.LoanDepositSwitchBean;


public interface QueryLoanDepositStatusDuService {
	
	public Map<String, List<LoanDepositSwitchBean>> queryLoanDepositStatusService(LoanDepositSwitchBean loanDepositSwitchBean);
	
	

}

