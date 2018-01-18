package com.pt.jpa.repo.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "plan_detail")
public class PlanDetailPO extends BasePO {
	
	@Column
	private int cycleindex;
	
	@Column
	private String content;  //json数组
	
	//optional=true：可选，表示此对象可以没有，可以为null；false表示必须存在
    @ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE }, optional = true)
    @JoinColumn(name = "plan_id")
	private PlanPO planPO;

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

	public PlanPO getPlanPO() {
		return planPO;
	}

	public void setPlanPO(PlanPO planPO) {
		this.planPO = planPO;
	}
	
	
}
