package BaiTap1_2810.service;

import java.util.Scanner;

public class Utiliti {
    public Double inputDouble(Scanner scanner) {
        while (true)
            try {
                return Double.parseDouble(scanner.nextLine());
            }
            catch (Exception e) {
                System.out.println("Nhap sai, nhap lai: ");
            }
    }

    public String inputString(Scanner scanner) {
        while (true)
            try {
                return scanner.nextLine();
            }
            catch (Exception e) {
                System.out.println("Nhap sai, nhap lai: ");
            }
    }

    public Integer inputInt(Scanner scanner) {
        while (true)
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Nhap sai, nhap lai: ");
            }

    }
}
