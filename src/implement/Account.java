package implement;

import implement.IAccount;

import java.util.Scanner;

public class Account implements IAccount {
    private String name;
    private int accountNumber;
    private String email;
    private double accountBalance;
    private Scanner scan = new Scanner(System.in);

    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", email='" + email + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }

    public void inputService() {
        System.out.println("Nhap ten");
        setName(scan.nextLine());
        System.out.println("Nhap email: ");
        setEmail(scan.nextLine());
        System.out.println("Nhap so du");
        setAccountBalance(Double.parseDouble(scan.nextLine()));
        System.out.println("Nhap account number: ");
        setAccountNumber(Integer.parseInt(scan.nextLine()));
    }

    @Override
    public double recharge() {
        return accountBalance*2;
    }

    @Override
    public String changeEmail() {
        System.out.println("Nhập email mới:");
        String newEmail = scan.nextLine();
        return newEmail;
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }
}
