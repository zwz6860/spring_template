package org.java.entity;

import java.io.Serializable;
import java.util.Date;

public class GameActivity implements Serializable {
    private Integer id;

    private Byte dateType;

    private Date activityBeginTime;

    private Date activityEndTime;

    private String activityName;

    private Byte activityAward;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getDateType() {
        return dateType;
    }

    public void setDateType(Byte dateType) {
        this.dateType = dateType;
    }

    public Date getActivityBeginTime() {
        return activityBeginTime;
    }

    public void setActivityBeginTime(Date activityBeginTime) {
        this.activityBeginTime = activityBeginTime;
    }

    public Date getActivityEndTime() {
        return activityEndTime;
    }

    public void setActivityEndTime(Date activityEndTime) {
        this.activityEndTime = activityEndTime;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Byte getActivityAward() {
        return activityAward;
    }

    public void setActivityAward(Byte activityAward) {
        this.activityAward = activityAward;
    }

	@Override
	public String toString() {
		return "GameActivity [id=" + id + ", dateType=" + dateType + ", activityBeginTime=" + activityBeginTime
				+ ", activityEndTime=" + activityEndTime + ", activityName=" + activityName + ", activityAward="
				+ activityAward + "]";
	}
    
}