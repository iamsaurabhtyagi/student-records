package com.college.student;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteRecord {

	public static void deleteRecord(Session s, int rollNo) {
		
		Session session=s;
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			StudentDetails student=(StudentDetails) session.get(StudentDetails.class, rollNo);
			if(student!=null){
				session.delete(student);
				tx.commit();
			}
			else {
				System.out.println("Details not available");
			}
			
		}
		catch(HibernateException e) {
			
		}
		finally {
			
		}
	}

}
