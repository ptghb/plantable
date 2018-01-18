package com.pt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pt.jpa.repo.UserPlanDetailRepository;
import com.pt.service.UserPlanDetailService;
import com.pt.vo.UserPlanDetailEntity;

@Service("userPlanDetailSerivce")
public class UserPlanDetailServiceImpl implements UserPlanDetailService{

	@Autowired
	private UserPlanDetailRepository dao;

	@Override
	public UserPlanDetailEntity save(UserPlanDetailEntity t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UserPlanDetailEntity user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserPlanDetailEntity> query() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserPlanDetailEntity query(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserPlanDetailEntity> query(Integer pageNo, Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
