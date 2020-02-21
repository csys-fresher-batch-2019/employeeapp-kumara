package com.Testemployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.employee.EMP_t2.empdetailsDAOImpl;
import com.employee.model.Empdept;
import com.employee.model.EmployeeDetail;
import com.employee.model.addressmodel;

public class testemp {
  public static final LoggerUtil logger = LoggerUtil.getInstance(); 
	
	
	public static  void main(String[] args) throws Exception {
		
	com.employee.EMP_t2.empdetailsDAOImpl obj= new com.employee.EMP_t2.empdetailsDAOImpl();
	
	//obj.empdept(employeeGender.male, 7);
	
	 //Select * from emp
		/*empdetailsDAOImpl obbj= new empdetailsDAOImpl();

	List<EmployeeDetail> nn =obbj.showemp();
	for (EmployeeDetail ee : nn) {
		
		logger.debug(ee.toString());
	}
		//obj.showemp();                 
		  
	  }}*/
/*------------------------------------------------------------------------------------------------*/
	//managname,h_id,dept_count
	
	    //obj.joinempdept() ; }}
		//System.out.println(obj.toString());;     
		
/*------------------------------------------------------------------------------------------------*/
		
		
//emptab k= new emptab(eId,departmentId,employeeName,gender,birthDate,joiningDate, panCard,adharNum,drivingLicense_num,employeeMobnum);
		//obj.jdate();
		
		//System.out.println(k);
		//obj.deptcount();   }}
	//Scanner sc = new Scanner(System.in);
	//System.out.println("Enter the Dept id");
	//int deptid=sc.nextInt();
	//obj.empdept(gender, e_id)
/*	ArrayList<Empdept> nn=obj.empdet(2);
for (Empdept ee : nn) {
		
		logger.debug(ee.toString());
	}
		
	}} */
		//obj.showemp();
	//EmployeeDetail e = new EmployeeDetail();
		//e.seteId1(-1);
		//e.setEId(-1);
		
		String e="anbuselvam";
List<addressmodel> nn=obj.addr(e);
for (addressmodel ee : nn) {
		
		logger.debug(ee.toString());
	}
		
	}}
	
 
	
	
			 
