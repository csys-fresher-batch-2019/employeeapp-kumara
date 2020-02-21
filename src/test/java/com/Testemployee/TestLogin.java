package com.Testemployee;

import java.util.Scanner;

public class TestLogin {

	public static void main(String[] args) throws Exception {
		
     com.employee.login.managerADDImpl obj=new com.employee.login.managerADDImpl();
     Scanner sc=new Scanner(System.in);
     String managerName=sc.next();
     String passWord=sc.next();
    
   obj.login(managerName, passWord);
   sc.close();
	}

}
