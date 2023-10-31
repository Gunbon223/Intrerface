package BaiTap1_2810;

import BaiTap1_2810.entities.Employee;
import BaiTap1_2810.service.CompanyService;
import BaiTap1_2810.service.EmployeService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        CompanyService service =new CompanyService();
        service.run(arrayList);
    }
}
