package com.bridgelabz;

/*
Apply TDD approach to add multiple Companies with each company containing multiple
employees.Store the companies in a collection and apply stream api to find
        1> Average salary accross the companies
        2> Maximum salary accross the companies
        3> Sort the employees in a particular company based on salary in
        descending order(Use your own comparator)
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CompanyTest {
    @Test
    void  givenCompanyArrayListShouldReturnAverageSalaryOfAllEmployees(){

        ArrayList<Company> companyArrayList = new ArrayList<>();

        Company c1 = new Company("infosys");
        Employee e1 = new Employee(1,"vinit",2000);
        Employee e2 = new Employee(2,"ram",3000);
        Employee e3 = new Employee(3,"kishan",4000);
        c1.employees.add(e1);
        c1.employees.add(e2);
        c1.employees.add(e3);

        Company c2 = new Company("wipro");
        Employee e4 = new Employee(4,"gururaj",2500);
        Employee e5 = new Employee(5,"mihir",3500);
        Employee e6 = new Employee(6,"nikhil",4500);
        c2.employees.add(e4);
        c2.employees.add(e5);
        c2.employees.add(e6);


        companyArrayList.add(c1);
        companyArrayList.add(c2);


        int result = CompanyMain.getAverageSalary(companyArrayList);
        Assertions.assertEquals(3250,result);
    }

    @Test
    void givenCompanyArrayListShouldReturnMaxSalaryOfAllEmployeesOfEachCompany(){
        ArrayList<Company> companyArrayList = new ArrayList<>();

        Company c1 = new Company("infosys");
        Employee e1 = new Employee(1,"vinit",20000);
        Employee e2 = new Employee(2,"ram",30000);
        Employee e3 = new Employee(3,"kishan",40000);
        c1.employees.add(e1);
        c1.employees.add(e2);
        c1.employees.add(e3);

        Company c2 = new Company("wipro");
        Employee e4 = new Employee(4,"gururaj",25000);
        Employee e5 = new Employee(5,"mihir",35000);
        Employee e6 = new Employee(6,"nikhil",45000);
        c2.employees.add(e4);
        c2.employees.add(e5);
        c2.employees.add(e6);


        companyArrayList.add(c1);
        companyArrayList.add(c2);


        int result = CompanyMain.getMaxiumSalary(companyArrayList);
        Assertions.assertEquals(45000,result);
    }
}



