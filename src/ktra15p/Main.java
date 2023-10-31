package ktra15p;

import ktra15p.entitites.Classroom;
import ktra15p.entitites.School;
import ktra15p.service.SchoolService;
import ktra15p.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Classroom> classroomArrayList = new ArrayList<>();
        SchoolService schoolService = new SchoolService();
        School school ;
        school = schoolService.inputSchool(classroomArrayList,scanner);
        schoolService.display10A1(school);
        schoolService.displayHome1985(school.getClassroomArrayList());
    }
}


