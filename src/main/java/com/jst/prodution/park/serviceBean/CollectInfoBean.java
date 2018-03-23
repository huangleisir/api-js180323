/*
* Copyright (c) 2015-2018 SHENZHEN JST SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/

package com.jst.prodution.park.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.park.serviceBean  
 * @ClassName: CollectInfoBean 
 * @Description: 收藏bean
 *
 * @author: hewen 
 * @date: 2018年3月6日 上午11:28:32 
 * @version V1.0 
 */
public class CollectInfoBean  extends BaseBean {
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	
    private String parkelecid ;
	
	private String name;
	
	private String adr;
	
	private String userId;

	private Date createDate;
	
	private String isCollect ; // 0 未收藏  1收藏 
	
	private List<CollectInfoBean>  collectList ;	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParkelecid() {
		return parkelecid;
	}

	public void setParkelecid(String parkelecid) {
		this.parkelecid = parkelecid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getIsCollect() {
		return isCollect;
	}

	public void setIsCollect(String isCollect) {
		this.isCollect = isCollect;
	}

	public List<CollectInfoBean> getCollectList() {
		return collectList;
	}

	public void setCollectList(List<CollectInfoBean> collectList) {
		this.collectList = collectList;
	}
	
	
}
