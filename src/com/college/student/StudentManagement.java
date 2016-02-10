package com.college.student;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;

public class StudentManagement {

	public static void main(String[] args) {

		Session session = null;
		try {

			StudentManagement obj = new StudentManagement();

			session = NewSession.getSession();
			

			while (true) {
				
				System.out.println("\t\t\t Add Student Record:     :1");
				System.out.println();
				System.out.println("\t\t\t All Student Record:     :2");
				System.out.println();
				System.out.println("\t\t\t Update Record     :     :3");
				System.out.println();
				System.out.println("\t\t\t Delete Record     :     :4");
				
				System.out.println("\n");
				
				obj.clearConsole();
				
				System.out.println("Enter your choice: ");
				Scanner user_input = new Scanner(System.in);
				int choice = Integer.valueOf(user_input.next());

				switch (choice) {

				case 1:
					InsertStudentDetail.insertRecord(session);
					break;
				case 2:
					StudentList.studentList(session);
					break;
				case 3:
					UpdateRecord.updateRecord(session, 71014, "V");
					break;
				case 4:
					DeleteRecord.deleteRecord(session, 71018);
					break;
				default:
					System.out.println("Wrong Input!");
					session.close();
					System.exit(0);
				}
			}
		} catch (HibernateException e) {
			session.close();
		} finally {
			if (session != null)
				session.close();
		}
	}

	public void clearConsole() {

		// Develop Code for this method.
		
	}
}
