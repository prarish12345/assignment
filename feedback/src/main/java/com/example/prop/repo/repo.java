package com.example.prop.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.prop.entity.emp;

import jakarta.persistence.Id;

@Repository
public interface repo extends CrudRepository<emp, Id> {

	void deleteById(Integer id);

	emp findById(int id);


	String save(int id);


	
	
}
