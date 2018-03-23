package com.jst.prodution.base.bean;

import java.util.Date;

public class BaseRoleBean implements java.io.Serializable{
	 /** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;

	/**
     * 角色ID.
     */
    private Long roleId;

    /**
     * 角色外码.
     */
    private String roleKey;

    /**
     * 角色名称.
     */
    private String roleName;

    /**
     * 角色描述.
     */
    private String roleDesc;

    /**
     * 角色创建者.
     */
    private String createUser;

    /**
     * 角色创建时间.
     */
    private Date createDate;
    

    /**
     * 最后修改时间.
     */
    private Date lastUpdateDate;


	public Long getRoleId() {
		return roleId;
	}


	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}


	public String getRoleKey() {
		return roleKey;
	}


	public void setRoleKey(String roleKey) {
		this.roleKey = roleKey;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public String getRoleDesc() {
		return roleDesc;
	}


	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}


	public String getCreateUser() {
		return createUser;
	}


	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}


	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
    
}
