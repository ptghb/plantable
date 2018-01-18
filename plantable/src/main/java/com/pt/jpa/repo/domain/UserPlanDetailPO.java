package com.pt.jpa.repo.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_plan_detail")
public class UserPlanDetailPO extends BasePO {
	
	@Column
	private Double cycleindex;
	@Column
	private Double point;
	@Column
	private int mood; //1:好，2:一般，3:差
	@Column
	private String summary;
	@Column
	private String finishstate;  //json数组
	
	//optional=true：可选，表示此对象可以没有，可以为null；false表示必须存在
    @ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE }, optional = true)
    @JoinColumn(name = "user_plan_id")
	private UserPlanPO userPlanPO;

	public Double getCycleindex() {
		return cycleindex;
	}

	public void setCycleindex(Double cycleindex) {
		this.cycleindex = cycleindex;
	}

	public Double getPoint() {
		return point;
	}

	public void setPoint(Double point) {
		this.point = point;
	}

	public int getMood() {
		return mood;
	}

	public void setMood(int mood) {
		this.mood = mood;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getFinishstate() {
		return finishstate;
	}

	public void setFinishstate(String finishstate) {
		this.finishstate = finishstate;
	}

	public UserPlanPO getUserPlanPO() {
		return userPlanPO;
	}

	public void setUserPlanPO(UserPlanPO userPlanPO) {
		this.userPlanPO = userPlanPO;
	}


}
