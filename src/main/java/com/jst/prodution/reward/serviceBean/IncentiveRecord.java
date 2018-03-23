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
public class IncentiveRecord implements Serializable {
    private String id;

    /**
    * 激励代码
    **/
    private String code;

    /**
    * 用户id
    **/
    private String uid;

    /**
    * 渠道
    **/
    private String channel;

    /**
    * 操作日期
    **/
    private Date operateTime;

    /**
    * 连续签到天数，非签到类型该值为0
    **/
    private Integer signInDays;

    /**
    * 激励模式，暂时为好币，MR
    **/
    private String incentiveModel;

    /**
    * 激励名称
    **/
    private String incentiveName;

    /**
    * 激励分数
    **/
    private Integer score;

    /**
    * 分数类型，加分还是减分，1加分，0减分
    **/
    private Integer scoreType;

    /**
    * 发送记账时间,发送给账户系统的时间
    **/
    private Date sendTime;

    /**
    * 状态,和其他系统链条时候的状态码
    **/
    private Integer state;

    /**
    * 是否可用，1可用，0不可用
    **/
    private Integer enable;

    private Date createTime;

    private String createBy;

    private Date lastUpdateTime;

    private String lastUpdateBy;

    private static final long serialVersionUID = 1L;

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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public Integer getSignInDays() {
        return signInDays;
    }

    public void setSignInDays(Integer signInDays) {
        this.signInDays = signInDays;
    }

    public String getIncentiveModel() {
        return incentiveModel;
    }

    public void setIncentiveModel(String incentiveModel) {
        this.incentiveModel = incentiveModel == null ? null : incentiveModel.trim();
    }

    public String getIncentiveName() {
        return incentiveName;
    }

    public void setIncentiveName(String incentiveName) {
        this.incentiveName = incentiveName == null ? null : incentiveName.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getScoreType() {
        return scoreType;
    }

    public void setScoreType(Integer scoreType) {
        this.scoreType = scoreType;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
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
        sb.append(", uid=").append(uid);
        sb.append(", channel=").append(channel);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", signInDays=").append(signInDays);
        sb.append(", incentiveModel=").append(incentiveModel);
        sb.append(", incentiveName=").append(incentiveName);
        sb.append(", score=").append(score);
        sb.append(", scoreType=").append(scoreType);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", state=").append(state);
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
        IncentiveRecord other = (IncentiveRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getChannel() == null ? other.getChannel() == null : this.getChannel().equals(other.getChannel()))
            && (this.getOperateTime() == null ? other.getOperateTime() == null : this.getOperateTime().equals(other.getOperateTime()))
            && (this.getSignInDays() == null ? other.getSignInDays() == null : this.getSignInDays().equals(other.getSignInDays()))
            && (this.getIncentiveModel() == null ? other.getIncentiveModel() == null : this.getIncentiveModel().equals(other.getIncentiveModel()))
            && (this.getIncentiveName() == null ? other.getIncentiveName() == null : this.getIncentiveName().equals(other.getIncentiveName()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getScoreType() == null ? other.getScoreType() == null : this.getScoreType().equals(other.getScoreType()))
            && (this.getSendTime() == null ? other.getSendTime() == null : this.getSendTime().equals(other.getSendTime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
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
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getChannel() == null) ? 0 : getChannel().hashCode());
        result = prime * result + ((getOperateTime() == null) ? 0 : getOperateTime().hashCode());
        result = prime * result + ((getSignInDays() == null) ? 0 : getSignInDays().hashCode());
        result = prime * result + ((getIncentiveModel() == null) ? 0 : getIncentiveModel().hashCode());
        result = prime * result + ((getIncentiveName() == null) ? 0 : getIncentiveName().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getScoreType() == null) ? 0 : getScoreType().hashCode());
        result = prime * result + ((getSendTime() == null) ? 0 : getSendTime().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        result = prime * result + ((getLastUpdateBy() == null) ? 0 : getLastUpdateBy().hashCode());
        return result;
    }
}