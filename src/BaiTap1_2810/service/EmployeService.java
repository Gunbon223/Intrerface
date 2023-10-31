package BaiTap1_2810.service;

import BaiTap1_2810.entities.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeService {
    Utiliti utility = new Utiliti();
    public Employee employeeInput(ArrayList<Employee> employeeArrayList, Scanner scan)
    {
        System.out.println("Nhap ten nhan vien: ");
        String name = utility.inputString(scan);
        System.out.println("Nhap ma nhan vien: ");
        int id = utility.inputInt(scan);
        System.out.println("Nhap luong nhan vien: ");
        double salary = utility.inputDouble(scan);
        Employee employee = new Employee(name,id,salary);
        employeeArrayList.add(employee);
        return employee;
    }

    public void findEmployeeBySalary(ArrayList<Employee>employeeArrayList,Scanner scan) {
        System.out.println("Nhap luong nhan vien can tim: ");
        double findingSalary = utility.inputDouble(scan);
        for (Employee i:
             employeeArrayList) {
            if (findingSalary == i.getSalary()) {
                System.out.println(i);
            }
        }
    }

    public void sortEmployeeBySalary(ArrayList<Employee> employeeArrayList,Scanner scan) {
        Employee e
        employeeArrayList.sort();
        }
    }
 }
