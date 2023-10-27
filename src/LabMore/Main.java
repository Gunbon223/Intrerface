package LabMore;

import LabMore.entities.Bill;
import LabMore.service.BillService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ArrayList<Bill> billArrayList = new ArrayList<>();
        BillService service = new BillService();
        Scanner scan = new Scanner(System.in);
        service.inputBill(scan,billArrayList);
        System.out.println(billArrayList);
        //2
    }

}
