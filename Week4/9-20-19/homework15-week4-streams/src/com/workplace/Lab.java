package com.workplace; // Put in whatever package your files are in

import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lab {

    private List<Employee> employees = Arrays.asList(
            new Employee("Bezos, Jeff", LocalDate.of(2004, 4, 2), 68_109.00, "Male"),
            new Employee("Sheryl Sandberg", LocalDate.of(2014, 7, 1), 87_846.00,"Female"),
            new Employee("Buffet, Warren", LocalDate.of(2011, 7, 23), 95_035.00, "Male"),
            new Employee("Susan Wojcick", LocalDate.of(2015, 6, 1), 37_210.00, "Female"),
            new Employee("Zuckerberg, Mark", LocalDate.of(2016, 5, 12), 48_450.00, "Male"),
            new Employee("Brin, Sergey", LocalDate.of(2016, 8, 5), 74_416.00, "Male")
    );

    private <T> void printList(List<T> list) {
        // print out all the elements of employees
        // Stream streamedList = employees.stream();
        // streamedList.forEach(System.out::println);
       list.forEach(System.out::println);
    }


    @Test
    public void getEmployeesOver50k() {
        // stream employee list
        // filter .getSalary > 50k
        List<Employee> employees = this.employees.stream().
                filter(employeeSalary -> employeeSalary.getSalary() > 50_000).
                collect(Collectors.toList());
        printList(employees);
    }


    @Test
    public void getEmployeeNamesHiredAfter2012() {
        // employees hired on or after jan 1, 2012
        LocalDate hiredYear = LocalDate.of(2012, 1, 1);
        List<Employee> employees = this.employees.stream()
                .filter(employee -> employee.getHireDate().isAfter(hiredYear)
                || employee.getHireDate().equals(hiredYear))
                .collect(Collectors.toList());
        printList(employees);
    }

    @Test
    public void getMaxSalary() {
        // print the maximum salary of all employees.
        // converts list to stream
        double max = this.employees.stream()
                // forces the stream to process doubles
                .mapToDouble(Employee::getSalary)
                // to find the max
                .max()
                // if empty stream, return 0
                .orElse(0);
        System.out.println("Max: $" + (int) max);

    }

    @Test
    public void getMinSalary() {
        // print the minimum salary of all employees.
        // converts list to stream
        double min = this.employees.stream()
                // forces the stream to process doubles
                .mapToDouble(Employee::getSalary)
                // to find the min
                .min()
                // if empty stream, return 0
                .orElse(0);
        System.out.println("Min: $" + (int) min);
    }

    @Test
    public void getAverageSalaries() {
        // print the average salary of male employees
        double averageMale = this.employees.stream()
                // since there is no getter method for gender,
                // parse toString to filter male employees
                .filter(employee -> employee.toString().contains("Male")).
                mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        // print the average salary of female employees
        double averageFemale = this.employees.stream()
                // since there is no getter method for gender,
                // parse toString to filter female employees
                .filter(employee -> employee.toString().contains("Female")).
                        mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        System.out.println("Averages: Male: $" + averageMale + " Female: $" + averageFemale);
        System.out.println("Averages: Male: $" + averageMale + " Female: $" + averageFemale);
        System.out.println("#equalPay");
    }

    @Test
    // use the reduce operation to find the Employee
    // instance of the employee with the highest salary
    public void getMaximumPaidEmployee() {
        Employee highest = this.employees.stream()
                // takes two elements at a time
                // evaluates them to return the higher value
                // repeats each time it processes a new element of stream
                .reduce((person1,person2) -> (person1.getSalary() > person2.getSalary()) ?
                        person1 : person2)
                .get();

        System.out.println(highest);
    }

}
