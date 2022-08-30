package com.cydeo.service;
/*
* TASK 4:
    Task 4:
    1-Create new module
    2- Create config,repository,model,service packages
    3- create Employee class with
        -name
        -department
        -hourlyRate fields
    4- Create EmployeeRepository interface
        one abstract method, int getHouryRate()
    5-Create impl class DBEmployeeRepository
        -override the method,
        -create one employee inside
        return emp1.getHouryRate()
    6-Create HoursRepository interface
        int getHours() abstract method
    7-Create RegularHours class override method and return 40
    8- Create Salary Service
        create calculateRegularySalary() method and print salary
    -------
    9-Create OvertimeHours class implement hours interface and override method and return 15
    10-Handle the error when you call calculateRegularSalary method
*
*
*
* */
public class Salary {
    public void calculateRegularSalary(){
        System.out.println("The salary is 6K");
    }
}
