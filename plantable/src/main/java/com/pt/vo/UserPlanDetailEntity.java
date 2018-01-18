package com.pt.vo;

public class UserPlanDetailEntity {

	private Long id; 
	private String name;
	private Double cycleindex;
	private Double point;
	private int mood; //1:好，2:一般，3:差
	private String summary;
	private String finishstate;  //json数组
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
}
