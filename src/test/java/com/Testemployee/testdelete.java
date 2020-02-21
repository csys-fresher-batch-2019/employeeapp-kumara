package com.Testemployee;

import java.util.Scanner;

import com.employee.EMP_t2.empdetailsDAOImpl;

public class testdelete {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
	    
  	     
	    System.out.println("Enter ID: "  );
	    int eId = sc.nextInt();
	    empdetailsDAOImpl  obj = new empdetailsDAOImpl();
	    obj.delete(eId);
	    System.out.println("\nDelete Successfull");
	    }
	     
}