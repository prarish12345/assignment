package com.orderentity.orderentity.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.orderentity.orderentity.entity.orderEntity;
import com.orderentity.orderentity.service.orderEntityService;

@RestController
@RequestMapping("/")
public class orderEntityController {
	
	@Autowired
	private orderEntityService os;
	
	@PostMapping("/saveorder")
	public ResponseEntity<orderEntity> createemp(@RequestBody orderEntity o) {
		orderEntity o1=  os.save(o);
		 return new ResponseEntity<>(o,HttpStatus.CREATED);
	}
	
	@GetMapping("/getorder")
	public List<orderEntity> getorders(){
		return os.getorders();
	}
	
	@GetMapping("/getorder/{id}")
	public Optional<orderEntity> getmenu(@PathVariable int id) {
		return os.getorder(id);
}
	@PutMapping("/update/{id}")
	public ResponseEntity<orderEntity> updateemp(@RequestBody orderEntity o) {
		orderEntity o1= os.save(o);
		 return new ResponseEntity<orderEntity>(o,HttpStatus.CREATED);
	
	}
}