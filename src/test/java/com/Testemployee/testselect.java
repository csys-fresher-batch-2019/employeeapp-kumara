package com.Testemployee;

import java.util.Scanner;

import com.employee.EMP_t2.empdetailsDAOImpl;

public class testselect {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		empdetailsDAOImpl e = new empdetailsDAOImpl();
		  System.out.println("1.View Particular Employee\n2.View ALL Employee\n");
		int ch = scan.nextInt();
		int eid = 0;
		if(ch==1)
		{ 
			System.out.println("Enter the id");
			 eid =scan.nextInt() ; 
			 e.sel(ch,eid);
		}
		else if(ch == 2) {
			e.sel(ch, eid);
		}

	}

}
