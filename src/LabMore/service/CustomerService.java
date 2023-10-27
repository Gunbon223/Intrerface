package LabMore.service;

import LabMore.entities.Customer;

import java.util.Scanner;

public class CustomerService {
    public Customer inputCustomer() {
        Scanner scan = new Scanner(System.in);
        Customer customer = new Customer();
        System.out.println("Nhap ten kh: ");
        customer.setName(scan.nextLine());
        System.out.println("Nhap so nha kh: ");
        customer.setHouseId(Integer.parseInt(scan.nextLine()));
        System.out.println("Nhap so cong to: ");
        customer.setPowerId(Integer.parseInt(scan.nextLine()));
        return customer;
    }
}
