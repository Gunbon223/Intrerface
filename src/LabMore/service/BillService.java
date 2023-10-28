package LabMore.service;

import LabMore.entities.Bill;
import LabMore.ultilites.Utility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BillService {
    //Xây dựng lớp BienLai để quản lý việc sử dụng và thanh toán tiền điện của các hộ dân
    //Với mỗi biên lai, có các thông tin sau: thông tin về hộ sử dụng điện, chỉ số cũ, chỉ số mới, số tiền phải trả của mỗi hộ sử dụng điện
    Utility utility = new Utility();

    public void inputBill(Scanner scan, ArrayList<Bill> billArray){
        System.out.println("Nhap so ho : ");
        int n = utility.inputInt(scan);
        for (int i = 0; i < n; i++) {
            Bill bill = new Bill();
            System.out.println("Nhap thong tin so dien cu: ");
            bill.setPrePowerCount(utility.inputDouble(scan));
            System.out.println("Nhap thong tin so dien moi: ");
            bill.setPowerCount(utility.inputDouble(scan));
            bill.setBillMoney();
            billArray.add(bill);
        }
    }
    public void display(ArrayList<Bill> billArrayList) {
        for (int i = 0; i < billArrayList.size(); i++) {
            System.out.println("Thong tin ho su dung dien thu "+ (i+1));
            Bill bill = billArrayList.get(i);
            System.out.println(bill);
        }
    }
}
