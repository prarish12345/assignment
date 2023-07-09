package com.orderItem.orderItem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderItem.orderItem.entity.orderItem;

@Repository
public interface Repo extends JpaRepository <orderItem, Integer>{

}
