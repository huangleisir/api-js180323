package com.jst.prodution.reward.serviceBean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class UserLevelConfig implements Serializable {
    private String id;

    private String levelName;

    private String levelCode;

    private Integer levelAmount;
    
    private String icon;

    private String remark;

    private Integer enable;

    private Date createTime;

    private String createBy;

    private Date lastUpdateTime;

    private String lastUpdateBy;

    private static final long serialVersionUID = 1L;

    
    public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getId() {
        return id;
    }

    public UserLevelConfig withId(String id) {
        this.setId(id);
        return this;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLevelName() {
        return levelName;
    }

    public UserLevelConfig withLevelName(String levelName) {
        this.setLevelName(levelName);
        return this;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }

    public String getLevelCode() {
        return levelCode;
    }

    public UserLevelConfig withLevelCode(String levelCode) {
        this.setLevelCode(levelCode);
        return this;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode == null ? null : levelCode.trim();
    }

    public Integer getLevelAmount() {
        return levelAmount;
    }

    public UserLevelConfig withLevelAmount(Integer levelAmount) {
        this.setLevelAmount(levelAmount);
        return this;
    }

    public void setLevelAmount(Integer levelAmount) {
        this.levelAmount = levelAmount;
    }

    public String getRemark() {
        return remark;
    }

    public UserLevelConfig withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getEnable() {
        return enable;
    }

    public UserLevelConfig withEnable(Integer enable) {
        this.setEnable(enable);
        return this;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public UserLevelConfig withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public UserLevelConfig withCreateBy(String createBy) {
        this.setCreateBy(createBy);
        return this;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public UserLevelConfig withLastUpdateTime(Date lastUpdateTime) {
        this.setLastUpdateTime(lastUpdateTime);
        return this;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public UserLevelConfig withLastUpdateBy(String lastUpdateBy) {
        this.setLastUpdateBy(lastUpdateBy);
        return this;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", levelName=").append(levelName);
        sb.append(", levelCode=").append(levelCode);
        sb.append(", levelAmount=").append(levelAmount);
        sb.append(", remark=").append(remark);
        sb.append(", enable=").append(enable);
        sb.append(", createTime=").append(createTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserLevelConfig other = (UserLevelConfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLevelName() == null ? other.getLevelName() == null : this.getLevelName().equals(other.getLevelName()))
            && (this.getLevelCode() == null ? other.getLevelCode() == null : this.getLevelCode().equals(other.getLevelCode()))
            && (this.getLevelAmount() == null ? other.getLevelAmount() == null : this.getLevelAmount().equals(other.getLevelAmount()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getLastUpdateTime() == null ? other.getLastUpdateTime() == null : this.getLastUpdateTime().equals(other.getLastUpdateTime()))
            && (this.getLastUpdateBy() == null ? other.getLastUpdateBy() == null : this.getLastUpdateBy().equals(other.getLastUpdateBy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLevelName() == null) ? 0 : getLevelName().hashCode());
        result = prime * result + ((getLevelCode() == null) ? 0 : getLevelCode().hashCode());
        result = prime * result + ((getLevelAmount() == null) ? 0 : getLevelAmount().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        result = prime * result + ((getLastUpdateBy() == null) ? 0 : getLastUpdateBy().hashCode());
        return result;
    }
}