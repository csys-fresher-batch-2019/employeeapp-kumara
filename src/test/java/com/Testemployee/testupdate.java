package com.Testemployee;

import java.util.Scanner;

import com.employee.EMP_t2.empdetailsDAOImpl;
import com.employee.model.EmployeeDetail;

public class testupdate {

	public static void main(String[] args) throws Exception {
		
	   
		EmployeeDetail ff = new EmployeeDetail();
		
		  Scanner sc = new Scanner(System.in);
		    System.out.println("Insert Employee id to update record: "  );
		    int eid = sc.nextInt();ff.seteId(eid);
		    System.out.println("Enter Employee departmentId >>");
		    int id = sc.nextInt();ff.setDepartmentId(id);
		  
		    empdetailsDAOImpl  obj = new empdetailsDAOImpl();
		    obj.upd(ff);
	}

}
