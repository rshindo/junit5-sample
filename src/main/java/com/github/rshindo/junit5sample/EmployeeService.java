package com.github.rshindo.junit5sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    List<Employee> employeeList = new ArrayList<>();

    {
        employeeList.add(new Employee("John", "Do", 39));
        employeeList.add(new Employee("Anna", "Karenina", 22));
        employeeList.add(new Employee("Tom", "Hardy", 27));
        employeeList.add(new Employee("Levi", "Jobs", 29));
    }

    List<Employee> findByName(String name) {
        return employeeList.stream().filter(e -> e.equals(name)).collect(Collectors.toList());
    }

}
