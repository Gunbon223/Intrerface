package BaiTap1_2810.service;

import BaiTap1_2810.entities.Employee;
import BaiTap1_2810.entities.Manager;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerService implements ITaxCalculate {
    EmployeService employeService = new EmployeService();
    Utiliti utiliti = new Utiliti();
    @Override
    public double taxCal(double salary) {
        if (salary < 11) {
            return salary;
        }
        else return (salary*0.1);
    }

    @Override
    public void display() {

    }

    @Override
    public double salaryCal(double salary) {
        return 0;
    }

    public void managerInput(ArrayList<Employee> employeeArrayList, Scanner scanner) {
        Employee employee = employeService.employeeInput(employeeArrayList,scanner);
        System.out.println("Nhap luong trach nhiem quan ly: ");
        Double resSalary = utiliti.inputDouble(scanner);
        Manager manager = new Manager(employee.getName(),employee.getId(),employee.getSalary(),resSalary);
        manager.setNewSalary();
        employeeArrayList.add(manager);

    }
}
