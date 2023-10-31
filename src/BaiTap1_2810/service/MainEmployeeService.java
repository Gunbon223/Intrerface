package BaiTap1_2810.service;

import BaiTap1_2810.entities.Employee;
import BaiTap1_2810.entities.MainEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEmployeeService {
    EmployeService employeService = new EmployeService();
    public void inputMainEmployee(ArrayList<Employee> employeeArrayList, Scanner scanner) {
        employeService.employeeInput(employeeArrayList,scanner);
    }



}
