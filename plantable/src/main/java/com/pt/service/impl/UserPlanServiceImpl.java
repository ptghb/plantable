package com.pt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pt.jpa.repo.UserPlanRepository;
import com.pt.service.UserPlanService;
import com.pt.vo.UserPlanEntity;

@Service("userPlanSerivce")
public class UserPlanServiceImpl implements UserPlanService{

	@Autowired
	private UserPlanRepository dao;

	@Override
	public UserPlanEntity save(UserPlanEntity t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UserPlanEntity user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserPlanEntity> query() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserPlanEntity query(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserPlanEntity> query(Integer pageNo, Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
