package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {
    public static int getAverageSalary(ArrayList<Company> companyArrayList){
        List individualSalarySumOfCompanies = companyArrayList.stream().map(company -> company.getEmpSalary()).toList();
        return 0;
    }

    public static int getMaxiumSalary(ArrayList<Company> companyArrayList) {
        List individualMaxSalaryOfCompanies = companyArrayList.stream().map(company -> company.getMaxSalary()).toList();
        return 0;
    }
}
