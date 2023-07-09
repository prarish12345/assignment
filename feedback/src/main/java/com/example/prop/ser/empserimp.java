package com.example.prop.ser;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prop.entity.emp;
import com.example.prop.exception.GlobalExceptionHandler;
import com.example.prop.repo.repo;

@Service
public  class empserimp  implements empser{
	
	@Autowired
	private repo r;


	@Override
	public List<emp> getemps() {
		// TODO Auto-generated method stub
	return (List<emp>) r.findAll();
	  
//		if(emplist.isEmpty()) {
//			throw new GlobalExceptionHandler("604","list empty");
//			return emplist;
//		}catch(Exception e) {
//			throw new GlobalExceptionHandler("605", "list missing"+ e.getMessage());
//		}
//		return (List<emp>) r.findAll();
	}

	@Override
	public emp getemp(int id) {
	//	try {
			return r.findById(id);
//		}catch(IllegalException e) {
//			throw new GlobalExceptionHandler("606", "given employee id is null"+ e.getMessage());
//		} catch(java.util.NoSuchElementException e) {
//			throw new GlobalExceptionHandler("606", "given employee is null"+ e.getMessage());
//		}
		// TODO Auto-generated method stub
		
	}

//	public emp updateemp(emp e, int id) {
//		emp e1= r.findById(id);
//		e1.setId(e.getId());
//		e1.setName(e.getName());
//		e1.setSalary(e.getSalary());
//		e1.setMail(e.getMail());
//		r.save(e1);
//		return e1;
//	}

//	public Object deleteemp(int id) {
//		// TODO Auto-generated method stub
//		return r.deleteById(id);
//	}





@Override
public void deleteemp(int id) {
	r.deleteById(id);
	
}


@Override
public emp save(emp e) {
//		if(emp.getName().isEmpty() || emp.getName().length()==0) {
//			throw new GlobalExceptionHandler("607", "Please send proper name");
//		} try {
		emp e1= r.save(e);

//		catch(IllegealArgumentException e) {
//		throw new GlobalExceptionHandler("608", "given emp is null" + e.getMessage());
//	}catch(Exception e2) {
//		throw new GlobalExceptionHandler("609", "Something went wrong" + e.getMessage());
	return r.save(e);
	
}




//	
//}







}


	

	

	
	

