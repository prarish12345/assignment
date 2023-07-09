package com.m.m.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.m.m.entity.menu;

@Repository
public interface Repo extends JpaRepository<menu, Integer> {
	

}
