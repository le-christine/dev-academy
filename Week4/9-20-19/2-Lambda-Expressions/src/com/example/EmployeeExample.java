package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeExample {
    public static void main(String[] args) {
        // we are creating a new arraylist of employee objects
        List<Employee> employeeList = new ArrayList<>();
        // making new employee objects
        // pushing to employee list
        employeeList.add(new Employee("John", "Smith", 20));
        employeeList.add(new Employee("Stacy", "Smith", 20));
        employeeList.add(new Employee("Mike", "Smith", 20));

        Collections.sort(employeeList, Comparator.comparing(Employee::getFirstName));
        for (Employee e: employeeList) {
            System.out.println(e);
        }

       // employeeList.forEach(e -> System.out.println(e));

    }
}
