package com.Testemployee;

import java.util.ArrayList;
import com.employee.mail.bloodDAOImpl;
import com.employee.mail.bloodneed;
import com.employee.model.bloodmodel;

public class testblood {

	public static void main(String[] args) throws Exception {
		
		bloodDAOImpl ob=new bloodDAOImpl();
		//Scanner b=new Scanner(System.in);
		String gmail ="kumarusaro@gmail.com";
		String pass ="usosbrenz";
		String sub="Blood Needed";
		String patientname="Naresh";
		String bloodGroup="A+";
		String hospitalName="Naren Hospital";
		String reason="accident";
		Long number=9876544268l;
		//int age=20;
		String location="kandigai";
		
		ArrayList<bloodmodel> list=new ArrayList<bloodmodel> ();
		list=ob.blood("A+");
	      for (bloodmodel bloodmodel : list) {
	    	  String mailId=bloodmodel.getGmail();
	bloodneed.send(gmail, pass, mailId, sub, bloodGroup, hospitalName, patientname, reason, number, location);      
	    	  System.out.println(bloodmodel);
	      
	      }
	}

}
