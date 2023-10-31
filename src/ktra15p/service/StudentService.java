package ktra15p.service;

import BaiTap1_2810.service.Utiliti;
import ktra15p.entitites.School;
import ktra15p.entitites.Student;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    Utiliti utiliti = new Utiliti();
    public Student inputStudent(Scanner scan) {
        Student student = new Student();
        System.out.println("Nhap ten hs: ");
        student.setName(utiliti.inputString(scan));
        System.out.println("Nhap tuoi dd-MM-yyyy");
        String inputTimeString = utiliti.inputString(scan);
        LocalDateTime dateTime = LocalDateTime.parse(inputTimeString,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        student.setDob(dateTime);
        System.out.println("Nhap que: ");
        student.setHome(utiliti.inputString(scan));
        return student;

    }


}
