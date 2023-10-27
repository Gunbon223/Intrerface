package LabMore.ultilites;

import java.util.Scanner;

public class ultil {
    public Double inputDouble(Scanner scanner) {
        while (true)
            try {
                return Double.parseDouble(scanner.nextLine());
            }
        catch (Exception e) {
            System.out.println("Nhap sai, nhap lai: ");
        }
    }
}
