package org.example.intermediate;

import org.example.intermediate.dto.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeBySalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John", "HR", 50000),
                new Employee(2,"Jane", "IT", 70000),
                new Employee(3,"Mike", "IT", 80000),
                new Employee(4,"Sara", "Finance", 60000),
                new Employee(5,"Paul", "HR", 55000)
        );

        List<Employee> asc = employees.stream()
                .sorted(Comparator.comparing(employee -> employee.getSalary()))
                .toList();
        System.out.println("Ascending Order : " + asc);

        List<Employee> desc = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();
        System.out.println("Descending Order : " + desc);
    }
}
