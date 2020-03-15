package org.springAnnotationStreotype;

import org.springAnnotationStreotype.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("application.xml");
        Employee employee=(Employee)context.getBean("employee",Employee.class);
        System.out.println(employee.toString());
    }
}
