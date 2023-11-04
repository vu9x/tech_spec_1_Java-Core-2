package org.example;

import java.text.ParseException;

public class Head extends Employee{

    public Head(String name, String birthday, double salary) throws ParseException {
        super(name, birthday, salary);
    }

    public static void updateEmployeesSalary(Employee employee,double newSalary){
        if(!(employee instanceof Head)){
            employee.setSalary(newSalary);
        }
    }
}
