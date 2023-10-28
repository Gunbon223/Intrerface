package LabMore;

import LabMore.entities.Bill;
import LabMore.service.BillService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Bill> billArrayList = new ArrayList<>();
        BillService service = new BillService();
        service.inputBill(scan,billArrayList);
        service.display(billArrayList);
    }
}
