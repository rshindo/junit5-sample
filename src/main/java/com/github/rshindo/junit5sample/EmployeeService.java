package com.github.rshindo.junit5sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    private List<Employee> employeeList = new ArrayList<>();

    {
        employeeList.add(new Employee("Ema", "Yasuhara", 39));
        employeeList.add(new Employee("Aoi", "Miyamori", 22));
        employeeList.add(new Employee("Sizuka", "Sakaki", 27));
        employeeList.add(new Employee("Misa", "Toudou", 29));
        employeeList.add(new Employee("Midori", "Imai", 29));
    }

    List<Employee> findByFirstNameStartingWith(String name) {
        return employeeList.stream().filter(e -> e.getFirstName().startsWith(name)).collect(Collectors.toList());
    }

    Employee findById(int id) {
    		return new Employee("Midori", "Imai", 21);
    }

}
