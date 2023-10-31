package BaiTap1_2810.service;

import BaiTap1_2810.entities.Employee;
import BaiTap1_2810.entities.MarketingEmplyee;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketingService implements ITaxCalculate{
    EmployeService employeService = new EmployeService();
    Utiliti utiliti = new Utiliti();
    @Override
    public double taxCal(double salary) {
        return 0;
    }

    @Override
    public void display() {

    }

    @Override
    public double salaryCal(double salary) {
        return 0;
    }

    public void marketingInput(ArrayList<Employee> employeeArrayList, Scanner scanner) {
        Employee employee = employeService.employeeInput(employeeArrayList,scanner);
        System.out.println("Nhap hoa hong cua nhan vien: ");
        int saleNumber = utiliti.inputInt(scanner);
        System.out.println("Nhap doanh so cua nhan vien marketing: ");
        Double bonus = utiliti.inputDouble(scanner);
        MarketingEmplyee marketingEmplyee = new MarketingEmplyee(employee.getName(),employee.getId(),employee.getSalary(),saleNumber,bonus);
        marketingEmplyee.setNewSalary();
        employeeArrayList.add(marketingEmplyee);
    }


}
