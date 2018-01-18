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
@Table(name = "plan")
public class PlanPO extends BasePO {
	
	@Column
	private String content;
	
	@Column
	private int cycle;

	@Column
	private Long creator;
	
	@Column
	private Date createtime;
	
	@Column
	private Date updatetime;
	
    //mappedBy="userPlanTablePO": 指明UserPlanTablePO类为双向关系维护端，负责外键的更新
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "planPO")
    private Set<PlanDetailPO> items = new HashSet<PlanDetailPO>();

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public int getCycle() {
		return cycle;
	}

	public void setCycle(int cycle) {
		this.cycle = cycle;
	}

	public Set<PlanDetailPO> getItems() {
		return items;
	}

	public void setItems(Set<PlanDetailPO> items) {
		this.items = items;
	}
}
