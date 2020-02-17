package com.mibu.composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDepartment implements EmployeeDetail {

  private List<EmployeeDetail> employeeDetailList;

  public CompanyDepartment() {
    this.employeeDetailList = new ArrayList<>();
  }

  @Override
  public void showEmployeeDetails() {
    for (EmployeeDetail emp : employeeDetailList) {
      emp.showEmployeeDetails();
    }
  }

  public void addEmployee(EmployeeDetail emp) {
    employeeDetailList.add(emp);
  }

  public void removeEmployee(EmployeeDetail emp) {
    employeeDetailList.remove(emp);
  }
}
