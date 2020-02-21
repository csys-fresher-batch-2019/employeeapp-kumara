package com.Testemployee;

import java.time.LocalDate;
import java.util.Scanner;

import org.jdbi.v3.core.Jdbi;

import com.employee.EMP_t2.empdetailsDAO;
import com.employee.EMP_t2.empdetailsDAOImpl;
import com.employee.model.EmployeeDetail;
import com.employee.model.dbconnection;

public class testinsert {
	  static  Jdbi jdbi = dbconnection.getJdbi();
      static empdetailsDAO lo=new empdetailsDAOImpl();
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EmployeeDetail ff = new EmployeeDetail();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee Name " );
		   String employeeName=sc.next();
		   ff.setEmployeeName(employeeName);
		    System.out.println("Enter gender(male/female/others)  " );
		    String Gender = sc.next();
		    ff.setGender(Gender);
		    System.out.println("Enter DOB  " );
		    String DateOfBirth = sc.next();
		    
		    ff.setBirthDate(LocalDate.parse(DateOfBirth));
		    //Date date = Date.valueOf(DateOfBirth);
		    
		    System.out.println("Enter Joindate  " );
		    String JoiningDate = sc.next();
             ff.setJoiningDate(LocalDate.parse(JoiningDate));
		    System.out.println("Enter Pan>> " );
		    String panCard = sc.next();
		    ff.setPanCard(panCard);
		    System.out.println("Enter Adhar >> " );
		    long AdharNumber = sc.nextLong();
		    ff.setAdharNum(AdharNumber);
		    System.out.println("Enter contactNo: >> " );
		    long employeeMobNum = sc.nextLong();
		    ff.setEmployeeMobnum(employeeMobNum);
		    System.out.println("Enter gmail : >>");
		    String gmail = sc.next();
		    sc.nextLine();ff.setGmail(gmail);
		    
		    System.out.println("Enter bloodGroup: (AB+,A+,B+,0+) >>");
		    String bloodGroup =sc.next();ff.setBloodGroup(bloodGroup);
		  //  empdetailsDAOImpl ee= new empdetailsDAOImpl();
			//ee.insert(ff);
		    lo.insert(ff);
		    
	}

}
