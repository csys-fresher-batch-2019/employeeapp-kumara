package com.Testemployee;

import java.sql.SQLException;
import java.util.List;

import com.employee.model.incrementmodel;
import com.employee.salary_t3.salaryDAOImpl;

public class testsal {
	  public static final LoggerUtil logger = LoggerUtil.getInstance(); 


	public static void main(String[] args) throws SQLException, Exception {
  
		salaryDAOImpl obj= new salaryDAOImpl();

	/*	
		int eId=1;
		List<salarymodel> nn=obj.tax(eId);
		for (salarymodel ee : nn) {
				
				logger.debug(ee.toString());
			}
				
	
			
	} */


      int noofyear=2;
      double increment=0.15;
        List<incrementmodel> nn=obj.increment(increment, noofyear);
        
      for (incrementmodel ee : nn) {
		
    	  
		logger.debug(ee.toString());
	}
		
	}}
	

