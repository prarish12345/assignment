package com.example.prop.cont;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prop.entity.emp;
import com.example.prop.repo.repo;
import com.example.prop.ser.empser;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/emp")
@Transactional
public class empcon {
	
	@Autowired
	private repo r;
	
	
	@Autowired
	private empser ser;
	
	@PostMapping("/saveemp")
	public ResponseEntity<emp> createemp(@RequestBody emp e) {
		emp e1=  ser.save(e);
		 return new ResponseEntity<>(e,HttpStatus.CREATED);
	}
    
	@GetMapping("/get")
	public List<emp> getemps(){
		return ser.getemps();
	}
	@GetMapping("/getemp/{id}")
	public emp getemp(@PathVariable int id) {
		return ser.getemp(id);
	}
    
	@PutMapping("/update/{id}")
	public ResponseEntity<emp> updateemp(@RequestBody emp e) {
		emp e1= ser.save(e);
		 return new ResponseEntity<emp>(e,HttpStatus.CREATED);
	
	}
	@PatchMapping("/cupdate/{id}")
	public ResponseEntity<emp> fullupdatemp(@PathVariable emp e){
		emp e1= ser.save(e);
		return new ResponseEntity<emp>(e, HttpStatus.CREATED);
	}
	
}
    
   




