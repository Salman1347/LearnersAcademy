package com.simpilearn.webapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simpilearn.webapp.Employee.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		/*
		 * Employee employee = new Employee(); employee.setId(1001);
		 * employee.setName("salman"); employee.setSalary(4.5);
		 * employee.setDept("Developer");
		 */
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");
    	Employee emp1=(Employee)context.getBean("emp1");
    	System.out.println(emp1);
    
    
    }
}

