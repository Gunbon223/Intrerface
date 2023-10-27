package LabMore.service;

import LabMore.entities.Bill;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BillService {
    //Xây dựng lớp BienLai để quản lý việc sử dụng và thanh toán tiền điện của các hộ dân
    //Với mỗi biên lai, có các thông tin sau: thông tin về hộ sử dụng điện, chỉ số cũ, chỉ số mới, số tiền phải trả của mỗi hộ sử dụng điện


    public void inputBill(Scanner scan, ArrayList<Bill> billArray){
        System.out.println("Nhap so ho : ");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            Bill bill = new Bill();
            System.out.println("Nhap thong tin so dien cu: ");
            bill.setPrePowerCount(Double.parseDouble(scan.nextLine()));
            System.out.println("Nhap thong tin so dien moi: ");
            bill.setPowerCount(Double.parseDouble(scan.nextLine()));
            bill.setBillMoney();
            billArray.add(bill);
        }
    }

}
