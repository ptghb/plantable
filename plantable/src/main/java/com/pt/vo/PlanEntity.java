package com.pt.vo;

import java.util.Date;

public class PlanEntity {

	private Long id; 
	private String name;
	private String content;
	private int cycle;
	private Long creator;
	private Date createtime;
	private Date updatetime;
	
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCycle() {
		return cycle;
	}
	public void setCycle(int cycle) {
		this.cycle = cycle;
	}
	public Long getCreator() {
		return creator;
	}
	public void setCreator(Long creator) {
		this.creator = creator;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	@Override
	public String toString() {
		return "PlanEntity [id=" + id + ", name=" + name + ", content=" + content + ", cycle=" + cycle + ", creator="
				+ creator + ", createtime=" + createtime + ", updatetime=" + updatetime + "]";
	}

	

}
