package com.college.student;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentList {

	public static void studentList(Session s) {
		
		Session session=s;
		System.out.println("New Session Created: "+session);
		
		Transaction tx=session.beginTransaction();
		
		List list=(List) session.createQuery("FROM StudentDetails").list();
		System.out.println(list);
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			StudentDetails student=(StudentDetails) itr.next();
			System.out.println(student.getStudentName()+"       "+student.getDob());
		}
		//tx.commit();
	}
}
