package com.orderentity.orderentity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.orderentity.orderentity.entity.orderEntity;
import com.orderentity.orderentity.repo.Repo;

@Service
public class orderEntityService implements orderentitys{
	
	@Autowired
	private Repo repo;

	public orderEntity save(orderEntity o) {
		// TODO Auto-generated method stub
		return repo.save(o);
	}
	public Optional<orderEntity> getorder(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	public List<orderEntity> getorders() {
		// TODO Auto-generated method stub
		return (List<orderEntity>) repo.findAll();
	}
}
