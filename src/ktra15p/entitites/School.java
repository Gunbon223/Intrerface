package ktra15p.entitites;

import java.util.ArrayList;

public class School {
    private ArrayList<Classroom> classroomArrayList;
    private String className;
    private String course;
    private String semester;

    public School(ArrayList<Classroom> students) {
        this.classroomArrayList = students;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + classroomArrayList +
                ", className='" + className + '\'' +
                ", course='" + course + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }

    public ArrayList<Classroom> getClassroomArrayList() {
        return classroomArrayList;
    }

    public void setClassroomArrayList(ArrayList<Classroom> classroomArrayList) {
        this.classroomArrayList = classroomArrayList;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
