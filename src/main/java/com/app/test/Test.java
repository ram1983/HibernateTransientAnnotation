package com.app.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Employee;
import com.app.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		
		Transaction tx=null;
		
		Session ses= HibernateUtil.getSf().openSession();
		tx=ses.beginTransaction();
		Employee emp= new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Ramanuj");
		emp.setEmpSal(123.00);
		
		ses.save(emp);
		tx.commit();
		ses.close();
		
		System.out.println("Successfully Done");
		
	}
}
