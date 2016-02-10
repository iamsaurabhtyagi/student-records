package com.college.student;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateRecord {
	
	public static void updateRecord(Session s, int rollNo, String semester){
	
		Session session=s;
		
		Transaction tx=null;
		
		try {
			tx=session.beginTransaction();
			
			StudentDetails student= (StudentDetails) session.get(StudentDetails.class, rollNo);
			student.setSemester(semester);
			session.update(student);
			tx.commit();
		}
		catch(HibernateException e) {
			
		}
		finally {
			
		}
		
	}
}
