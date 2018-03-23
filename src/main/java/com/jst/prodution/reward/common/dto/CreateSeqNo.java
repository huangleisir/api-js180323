package com.jst.prodution.reward.common.dto;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.RandomStringUtils;

import com.jst.prodution.reward.common.enums.TransEnum;


public class CreateSeqNo {
    /** 
     * 请求流水号 
     *   请求流水号 （30）=交易码（6）+时间（17）+随机数（7） 
     * @param transCode   交易码 
     * @return 请求流水号 （30）
     */  
    public static  String createReqSerial(String transCode){   
        SimpleDateFormat sdft = new SimpleDateFormat("yyyyMMddHHmmssSSS");  
        Date nowdate = new Date();  
        String str = sdft.format(nowdate);  
        return  transCode+ str + RandomStringUtils.randomNumeric(7);  
    } 
    
    public static void main(String[] args) {  
    	 System.out.println(createReqSerial(TransEnum.TRANS_RT0001.getCode())); 
    	  
    }  
}
