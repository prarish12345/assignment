package com.orderItem.orderItem.controller;

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


import com.orderItem.orderItem.entity.orderItem;
import com.orderItem.orderItem.service.orderItemServiceImpl;

@RestController
@RequestMapping("/")
public class orderItemController {
	
	@Autowired
	private orderItemServiceImpl os;
	
	@PostMapping("/saveorderItem")
	public ResponseEntity<orderItem> createemp(@RequestBody orderItem ot) {
		orderItem ot1=  ot.save(ot);
		 return new ResponseEntity<>(ot,HttpStatus.CREATED);
	}
	
	@GetMapping("/getorderItem")
	public List<orderItem> getemps(){
		return os.getorderItems();
	}
	
	@GetMapping("/getorderItem/{id}")
	public Optional<orderItem> getmenu(@PathVariable int id) {
		return os.getmenu(id);
}
	
	@PutMapping("/updateorderItem/{id}")
	public ResponseEntity<orderItem> updateemp(@RequestBody orderItem ot) {
		orderItem e1= ot.save(ot);
		 return new ResponseEntity<orderItem>(ot,HttpStatus.CREATED);
	
}
}