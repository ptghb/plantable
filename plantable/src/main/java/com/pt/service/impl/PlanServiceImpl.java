package com.pt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pt.jpa.repo.PlanRepository;
import com.pt.service.PlanService;
import com.pt.vo.PlanEntity;

@Service("planSerivce")
public class PlanServiceImpl implements PlanService{

	@Autowired
	private PlanRepository dao;

	@Override
	public PlanEntity save(PlanEntity t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(PlanEntity user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PlanEntity> query() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlanEntity query(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanEntity> query(Integer pageNo, Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	


}
