package com.mibu.composite;

public class Main {

  public static void main(String[] args) {
    Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer");
    Developer dev2 = new Developer(101, "Vinay Sharma", "Developer");

    CompanyDepartment engDirectory = new CompanyDepartment();
    engDirectory.addEmployee(dev1);
    engDirectory.addEmployee(dev2);

    Manager man1 = new Manager(200, "Kushagra Garg", "SEO Manager");
    Manager man2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager");

    CompanyDepartment accDirectory = new CompanyDepartment();
    accDirectory.addEmployee(man1);
    accDirectory.addEmployee(man2);

    CompanyDepartment directory = new CompanyDepartment();
    directory.addEmployee(engDirectory);
    directory.addEmployee(accDirectory);

    directory.showEmployeeDetails();
  }
}
