package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService service = (EmployeeService) context.getBean("employeeService");

		service.delete();
		service.store();
		service.getEmployee(2);
		service.getAllEmployee(4,"abhish");
		service.loadedEmployee(5, 1000);
		service.updateEmployee(8);
	}

}