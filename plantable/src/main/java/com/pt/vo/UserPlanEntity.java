package com.pt.vo;

import java.util.Date;

import javax.persistence.Column;

public class UserPlanEntity {

	private Long id; 
	private String name;
	private Long userid;
	private Long planid;
	private Double avgpoint;
	private String summary;
	private Date joinstartdate;
	private Date joinenddate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@Override
	public String toString() {
		return "UserPlanEntity [id=" + id + ", name=" + name + ", userid=" + userid + ", planid=" + planid
				+ ", avgpoint=" + avgpoint + ", summary=" + summary + ", joinstartdate=" + joinstartdate
				+ ", joinenddate=" + joinenddate + "]";
	}
    
}
