package com.pt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pt.jpa.repo.PlanDetailRepository;
import com.pt.service.PlanDetailService;
import com.pt.vo.PlanDetailEntity;

@Service("planDetailSerivce")
public class PlanDetailServiceImpl implements PlanDetailService{

	@Autowired
	private PlanDetailRepository dao;

	@Override
	public PlanDetailEntity save(PlanDetailEntity t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(PlanDetailEntity user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PlanDetailEntity> query() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlanDetailEntity query(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanDetailEntity> query(Integer pageNo, Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	


}
