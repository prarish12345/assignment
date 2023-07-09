  package com.m.m.controller;

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


import com.m.m.entity.menu;
import com.m.m.service.menuServiceImpl;

@RestController
@RequestMapping("/menu")
public class menuController {
   
	
	@Autowired
	private menuServiceImpl ms;
	
	@PostMapping("/savemenu")
	public ResponseEntity<menu> createemp(@RequestBody menu m) {
		menu m1=  ms.save(m);
		 return new ResponseEntity<>(m,HttpStatus.CREATED);
	}
	
	@GetMapping("/getmenu")
	public List<menu> getemps(){
		return ms.getmenus();
	}
	
	@GetMapping("/getmenu/{id}")
	public Optional<menu> getmenu(@PathVariable int id) {
		return ms.getmenu(id);
	
}
	@PutMapping("/update/{id}")
	public ResponseEntity<menu> updateemp(@RequestBody menu e) {
		menu e1= ms.save(e);
		 return new ResponseEntity<menu>(e,HttpStatus.CREATED);
	
	}
	
}