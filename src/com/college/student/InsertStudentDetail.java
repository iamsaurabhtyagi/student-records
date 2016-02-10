package com.college.student;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class InsertStudentDetail {

	public static void insertRecord(Session s) {
		
		Session session=s;
		System.out.println("The Session Object: "+session);
		
		Transaction t=session.beginTransaction();
		//System.out.println("The Transaction Object: "+t);
		
		StudentDetails d=new StudentDetails();
		d.setStudentName("Chhavi Chaudhary");
		d.setFatherName("Gopal Singh");
		d.setMotherName("Chandrakanta Devi");
		d.setDob("27/Aug/1980");
		d.setDepartment("Phullo");// code should be here like remove white space if user given 
		d.setBranch("Phullo");//same as department
		d.setYear("3");
		d.setSemester("6");
		d.setLocalAddress("CHD");
		d.setPermanentAddress("PB");
		
		//session.persist(d);
		session.save(d);
		
		System.out.println("Student Detials Associated with Session");
		
		session.flush();
		t.commit();
		System.out.println("Transaction Commited");
		
		System.out.println("Data Successfully Saved.");
		System.out.println("Student's Roll Number: "+d.getRollNo());
		
	}
}
