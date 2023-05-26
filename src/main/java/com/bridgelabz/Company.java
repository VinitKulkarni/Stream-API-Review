package com.bridgelabz;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class Company {
    String companyName;
    ArrayList<Employee> employees;

    public Company(String companyName) {
        this.companyName = companyName;
        employees = new ArrayList<>();
    }

    public OptionalDouble getEmpSalary() {
        OptionalDouble averageOfSalaries = employees.stream().mapToDouble(employees->employees.salary).average();

        System.out.println("###"+averageOfSalaries);
        return averageOfSalaries;
    }

    public OptionalDouble getMaxSalary(){
        OptionalDouble maxOfSalaries = employees.stream().mapToDouble(employees->employees.salary).max();
        System.out.println("******* "+maxOfSalaries);
        return maxOfSalaries;
    }
}
