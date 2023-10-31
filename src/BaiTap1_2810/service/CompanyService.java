package BaiTap1_2810.service;

import BaiTap1_2810.entities.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CompanyService {
    EmployeService employeService = new EmployeService();
    Utiliti utility = new Utiliti();
    ManagerService managerService = new ManagerService();
    MarketingService marketingService = new MarketingService();

    public void run(ArrayList<Employee> employeeArrayList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("**********Quan ly cong ty***********");
        String choice;
        do {
            System.out.println("Nhap loai nhan vien muon them vao:");
            System.out.println("1. Nhan vien");
            System.out.println("2. Manager");
            System.out.println("3. Marketing Employee");
            System.out.println("Nhap lua chon cua ban: ");
            switch (utility.inputInt(scan))
            {
                case 1:
                    employeService.employeeInput(employeeArrayList,scan);
                    break;
                case 2:
                    managerService.managerInput(employeeArrayList,scan);
                    break;
                case 3:
                    marketingService.marketingInput(employeeArrayList,scan);
                    break;
            }
            System.out.println("Tiep tuc nhap? y/n no de hien ra menu: ");
            choice = utility.inputString(scan);
        }
        while (choice.equalsIgnoreCase("y"));

        System.out.println("menu quan ly");
        if (choice.equalsIgnoreCase("n")) {
        do {
                System.out.println("1.In danh sach");
                System.out.println("2.Tim hoac xoa nv");
                System.out.println("3.Sap xep nhan vien theo ten");
                System.out.println("4.Sap xep nhan vien theo luong");
                System.out.println("5.In 5 nhan vien luong cao nhat");
                System.out.println("6.Tim nhan vien theo luong");
                System.out.println("7.Nhap tiep nhan vien");
                System.out.println("Nhap lua chon: ");
                switch (utility.inputInt(scan)) {
                    case 1:
                        System.out.println(employeeArrayList);
                        choice=getChoice(choice,scan);
                        break;
                    case 2:
                        updateOrDeleteEmployee(employeeArrayList,scan);
                        choice=getChoice(choice,scan);
                        break;
                    case 3:
                        sortEmployeeByName(employeeArrayList);
                        System.out.println(employeeArrayList);
                        choice=getChoice(choice,scan);
                        break;
                    case 4:
                        sortEmployeeBySalary(employeeArrayList);
                        System.out.println(employeeArrayList);
                        choice=getChoice(choice,scan);
                        break;
                    case 5:
                        topFiveHighSalary(employeeArrayList);
                        choice=getChoice(choice,scan);
                        break;
                    case 6:
                        findEmployeeBySalary(employeeArrayList,scan);
                        choice=getChoice(choice,scan);
                        break;
                    case 7:
                        run(employeeArrayList);
                        break;
                }
        } while (choice.equalsIgnoreCase("y"));
         }
    }
    public String getChoice(String choice,Scanner scan) {
        System.out.println("Tiep tuc? y/n");
        return utility.inputString(scan);
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

    public boolean findEmpoyee(ArrayList<Employee>employeeArrayList,int searchId) {
        for (Employee i:
                employeeArrayList) {
            if (i.getId()==searchId) {
                return true;
            }
        }
        return false;
    }
    public void updateOrDeleteEmployee(ArrayList<Employee>employeeArrayList,Scanner scan) {
        System.out.println("Nhap id nhan vien muon xoa/update");
        int findId = utility.inputInt(scan);
        if (findEmpoyee(employeeArrayList, findId))
        {
            System.out.println("Tim thay. Nhap lua chon: ");
            System.out.println("1.Update");
            System.out.println("2.Delete");
            switch (utility.inputInt(scan))
            {
                case 1:
                    for (Employee e:
                            employeeArrayList) {
                        if(e.getId()==findId) {
                            Employee updateEmployee = e;
                            System.out.println("Nhap ten moi: ");
                            updateEmployee.setName(utility.inputString(scan));
                            System.out.println("Nhap luong moi: ");
                            updateEmployee.setSalary(utility.inputDouble(scan));
                            employeeArrayList.set((findId-1),updateEmployee);
                            System.out.println("update thanh cong");
                            break;
                        }
                    }
                    break;
                case 2:
                    for (Employee e:
                            employeeArrayList) {
                        if(e.getId()==findId) {
                            employeeArrayList.remove((findId-1));
                            System.out.println("Xoa thanh cong");
                            break;
                        }
                    }
                    break;
            }
        }
    }

    public void topFiveHighSalary(ArrayList<Employee> employeeArrayList) {
        System.out.println("danh sach nhan vien luong cao nhan nhat: ");
        sortEmployeeBySalary(employeeArrayList);
        for(int i=0;i<5 && i<employeeArrayList.size();i++) {
            Employee temp = employeeArrayList.get(i);
            System.out.println("Nhan vien thu "+i+" "+temp);
        }
    }

    public void sortEmployeeBySalary(ArrayList<Employee> employeeArrayList) {
        Collections.sort(employeeArrayList,new EmplyeeSalaryComparator());
    }

    public void sortEmployeeByName(ArrayList<Employee> employeeArrayList) {
        Collections.sort(employeeArrayList,new EmployeeNameComparator());
    }


    public class EmplyeeSalaryComparator implements java.util.Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return Double.compare(o1.getSalary(), o2.getSalary());
        }
    }

    public class EmployeeNameComparator implements java.util.Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            // Sắp xếp theo thuộc tính name
            return o1.getName().compareTo(o2.getName());
        }
    }
}
