package com.orderentity.orderentity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderentity.orderentity.entity.orderEntity;

@Repository
public interface Repo extends JpaRepository <orderEntity, Integer> {

}
