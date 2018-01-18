package com.pt.jpa.repo.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user_plan_table")
public class UserPlanPO extends BasePO {
	
	@Column
	private Long userid;
	@Column
	private Long planid;
	@Column
	private Double avgpoint;
	@Column
	private String summary;
	@Column
	private Date joinstartdate;
	@Column
	private Date joinenddate;
	
    //mappedBy="userPlanTablePO": 指明UserPlanTablePO类为双向关系维护端，负责外键的更新
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "userPlanPO")
    private Set<UserPlanDetailPO> items = new HashSet<UserPlanDetailPO>();
	
	public Double getAvgpoint() {
		return avgpoint;
	}
	public void setAvgpoint(Double avgpoint) {
		this.avgpoint = avgpoint;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Date getJoinstartdate() {
		return joinstartdate;
	}
	public void setJoinstartdate(Date joinstartdate) {
		this.joinstartdate = joinstartdate;
	}
	public Date getJoinenddate() {
		return joinenddate;
	}
	public void setJoinenddate(Date joinenddate) {
		this.joinenddate = joinenddate;
	}
	public Set<UserPlanDetailPO> getItems() {
		return items;
	}
	public void setItems(Set<UserPlanDetailPO> items) {
		this.items = items;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public Long getPlanid() {
		return planid;
	}
	public void setPlanid(Long planid) {
		this.planid = planid;
	}
	
	
}
