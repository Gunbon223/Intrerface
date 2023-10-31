package ktra15p.entitites;

import java.util.ArrayList;

public class Classroom {
    ArrayList<Student> students;
    String className;

    public Classroom() {
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
