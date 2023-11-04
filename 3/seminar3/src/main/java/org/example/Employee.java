package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Comparable<Employee> {
    private String name;
    private Date birthday;
    private final String pattern = "yyyy-mm-dd";
    private double salary;
    public Employee(String name, String birthday, double salary) throws ParseException {
        this.name = name;
        this.birthday = new SimpleDateFormat(pattern).parse(birthday);
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int compareTo(Employee other){
        return this.getBirthday().compareTo(other.getBirthday());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", salary=" + salary +
                '}';
    }
}
