package org.example;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        try {
            Head head = new Head("John", "1991-02-15", 20);
            Employee employee1 = new Employee("Michale", "1995-10-19", 10);

            Employee[] company = new Employee[]{head, employee1};

            for (int i = 0; i < company.length; i++) {
                Head.updateEmployeesSalary(company[i], 200);
            }

            for (int i = 0; i < company.length; i++) {
                System.out.println(company[i].toString());
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}