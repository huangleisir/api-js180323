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
public class BasicConfiguration implements Serializable {
    /**   
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)   
	 */  
	private static final long serialVersionUID = -776739636798339200L;

	/**
    * 主键
    **/
    private String id;

    /**
    * 激励代码,表明是什么类型的激励
    **/
    private String code;

    /**
    * 激励的名称
    **/
    private String incentiveName;

    /**
    * 渠道，第一阶段都是appfront
    **/
    private String channel;

    /**
    * 激励模式,第一阶段都是MR，即好币
    **/
    private String incentiveModel;

    /**
    * 激励详细规则表
    **/
    private String ruleConfigurationTable;

    /**
    * 开始日期
    **/
    private Date startDate;

    /**
    * 失效日期
    **/
    private Date expirationDate;

    /**
    * 每日限制次数
    **/
    private Integer dayLimit;

    /**
    * 是否可用，1可用，0不可用
    **/
    private Integer enable;

    /**
    * 状态码，暂时无用
    **/
    private Integer state;

    private Date createTime;

    private String createBy;

    private Date lastUpdateTime;

    private String lastUpdateBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getIncentiveName() {
        return incentiveName;
    }

    public void setIncentiveName(String incentiveName) {
        this.incentiveName = incentiveName == null ? null : incentiveName.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getIncentiveModel() {
        return incentiveModel;
    }

    public void setIncentiveModel(String incentiveModel) {
        this.incentiveModel = incentiveModel == null ? null : incentiveModel.trim();
    }

    public String getRuleConfigurationTable() {
        return ruleConfigurationTable;
    }

    public void setRuleConfigurationTable(String ruleConfigurationTable) {
        this.ruleConfigurationTable = ruleConfigurationTable == null ? null : ruleConfigurationTable.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getDayLimit() {
        return dayLimit;
    }

    public void setDayLimit(Integer dayLimit) {
        this.dayLimit = dayLimit;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
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
        sb.append(", code=").append(code);
        sb.append(", incentiveName=").append(incentiveName);
        sb.append(", channel=").append(channel);
        sb.append(", incentiveModel=").append(incentiveModel);
        sb.append(", ruleConfigurationTable=").append(ruleConfigurationTable);
        sb.append(", startDate=").append(startDate);
        sb.append(", expirationDate=").append(expirationDate);
        sb.append(", dayLimit=").append(dayLimit);
        sb.append(", enable=").append(enable);
        sb.append(", state=").append(state);
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
        BasicConfiguration other = (BasicConfiguration) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getIncentiveName() == null ? other.getIncentiveName() == null : this.getIncentiveName().equals(other.getIncentiveName()))
            && (this.getChannel() == null ? other.getChannel() == null : this.getChannel().equals(other.getChannel()))
            && (this.getIncentiveModel() == null ? other.getIncentiveModel() == null : this.getIncentiveModel().equals(other.getIncentiveModel()))
            && (this.getRuleConfigurationTable() == null ? other.getRuleConfigurationTable() == null : this.getRuleConfigurationTable().equals(other.getRuleConfigurationTable()))
            && (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
            && (this.getExpirationDate() == null ? other.getExpirationDate() == null : this.getExpirationDate().equals(other.getExpirationDate()))
            && (this.getDayLimit() == null ? other.getDayLimit() == null : this.getDayLimit().equals(other.getDayLimit()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
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
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getIncentiveName() == null) ? 0 : getIncentiveName().hashCode());
        result = prime * result + ((getChannel() == null) ? 0 : getChannel().hashCode());
        result = prime * result + ((getIncentiveModel() == null) ? 0 : getIncentiveModel().hashCode());
        result = prime * result + ((getRuleConfigurationTable() == null) ? 0 : getRuleConfigurationTable().hashCode());
        result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        result = prime * result + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        result = prime * result + ((getDayLimit() == null) ? 0 : getDayLimit().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        result = prime * result + ((getLastUpdateBy() == null) ? 0 : getLastUpdateBy().hashCode());
        return result;
    }
}