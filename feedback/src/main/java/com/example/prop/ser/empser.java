package com.example.prop.ser;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.prop.entity.emp;


public interface empser {
	
	
	public List<emp> getemps();
	
	public emp getemp(int id);
	
	
	




	public void deleteemp(int id);


	public emp save(emp e);

//	public Object update(int id, emp e);


	


	


	
	
	
	
	

}
