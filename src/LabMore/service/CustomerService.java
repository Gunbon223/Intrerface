package LabMore.service;

import LabMore.entities.Customer;
import LabMore.ultilites.Utility;

import java.util.Scanner;

public class CustomerService {
    Utility utility = new Utility();
    public Customer inputCustomer() {
        Scanner scan = new Scanner(System.in);
        Customer customer = new Customer();
        System.out.println("Nhap ten khach hang: ");
        customer.setName(utility.inputString(scan));
        System.out.println("Nhap so nha khach hang: ");
        customer.setHouseId(utility.inputInt(scan));
        System.out.println("Nhap ma cong to: ");
        customer.setPowerId(utility.inputInt(scan));
        return customer;
    }

}
