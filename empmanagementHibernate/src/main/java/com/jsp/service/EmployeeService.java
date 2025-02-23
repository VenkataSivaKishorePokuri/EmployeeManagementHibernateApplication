package com.jsp.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.jsp.entity.Employee;



public class EmployeeService {

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("kishore");

	//public EmployeeService() {
		
	//}

	public void addEmployee(Employee employee)  {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
			
			transaction = em.getTransaction();
			transaction.begin();
			
			em.persist(employee);
			transaction.commit();

		
	}

	public List<Employee> getAllEmployees() {
		EntityManager em = emf.createEntityManager();
		
			TypedQuery<Employee> query = em.createQuery("SELECT e FROM Employee e", Employee.class);
			return query.getResultList();
	
	}

	public void updateEmployee(Employee employee) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		

		
			transaction = em.getTransaction();
			transaction.begin();
			Employee emp = em.find(Employee.class, employee.getId());
			if (emp != null) {
				emp.setName(employee.getName());
				emp.setAge(employee.getAge());
				emp.setEmail(employee.getEmail());
				emp.setSalary(employee.getSalary());

				em.merge(emp);
				transaction.commit();
			}
			else {
				System.out.println("there is no employee data");
			}
			
			

	}

	public void deleteEmployee(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
			transaction = em.getTransaction();
			transaction.begin();
			Employee employee = em.find(Employee.class, id);
			if (employee != null) {
				em.remove(employee);
				transaction.commit();
			}
			else {
				System.out.println("there is no employee data to delete");
			}
		
	}

}