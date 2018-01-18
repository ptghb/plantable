package com.pt.vo;

public class PlanDetailEntity {

	private Long id; 
	private String name;
	private int cycleindex;
	private String content;  //json数组
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
	public int getCycleindex() {
		return cycleindex;
	}
	public void setCycleindex(int cycleindex) {
		this.cycleindex = cycleindex;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}


}
