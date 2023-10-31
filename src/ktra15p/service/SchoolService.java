package ktra15p.service;

import BaiTap1_2810.service.Utiliti;
import ktra15p.entitites.Classroom;
import ktra15p.entitites.School;
import ktra15p.entitites.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolService {
    Utiliti utiliti = new Utiliti();
    StudentService studentService= new StudentService();



    public School inputSchool(ArrayList<Classroom> classrooms, Scanner scan) {
            ArrayList<Student> studentArrayList=new ArrayList<>();
            System.out.println("Nhap so hoc sinh muon them: ");
            int n = utiliti.inputInt(scan);
            for (int i = 0; i < n; i++) {
                studentArrayList.add(studentService.inputStudent(scan));
            }
            Classroom classroom = new Classroom();
            classroom.setStudents(studentArrayList);
            School school = new School(classrooms);
            System.out.println("Nhap ten lop: ");
            classroom.setClassName(utiliti.inputString(scan));
            System.out.println("Nhap ten khoa hoc: ");
            school.setCourse(utiliti.inputString(scan));
            System.out.println("Nhap ky hoc: ");
            school.setSemester(utiliti.inputString(scan));
            classrooms.add(classroom);
        return school;
    }



    public void display10A1(School schools) {
        System.out.println("Danh sach hs lop 10A1");
        for (Classroom i:
             schools.getClassroomArrayList()) {
            if (i.getClassName().equalsIgnoreCase("10a1")) {
                System.out.println(i.getStudents());
            }
        }
    }
    public void displayHome1985(ArrayList<Classroom> classrooms) {
        System.out.println("Danh sach hoc sinh que Thai Nguyen, sinh nam 1985: ");
        for (Classroom x:
                classrooms)
        {
        for (Student i:
                x.getStudents()) {
            if (i.getHome().equalsIgnoreCase("Thai Nguyen") && i.getDob().getYear() == 1985) {
                System.out.println(i);
            }
        }
        }

    }
}


