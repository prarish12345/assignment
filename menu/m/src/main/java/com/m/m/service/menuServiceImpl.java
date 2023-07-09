package com.m.m.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m.m.entity.menu;
import com.m.m.repo.Repo;

@Service
public class menuServiceImpl implements menuService {
	
	
	@Autowired
	private Repo r;

	public menu save(menu m) {
		// TODO Auto-generated method stub
		return r.save(m);
	}

	public List<menu> getmenus() {
		// TODO Auto-generated method stub
		return (List<menu>) r.findAll();
	}

	public Optional<menu> getmenu(int id) {
		// TODO Auto-generated method stub
		return r.findById(id);
	}

	                      
}
