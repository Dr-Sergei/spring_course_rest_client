package org.sergei.spring.rest;

import org.sergei.spring.rest.configuration.MyConfig;
import org.sergei.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> employeeList = communication.getAllEmployees();
//
//        for(Employee e : employeeList){
//            System.out.println(e);
//        }

        Employee employee = communication.getEmployee(4);
        System.out.println(employee);
    }
}
