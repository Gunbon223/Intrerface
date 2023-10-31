package BaiTap1_2810.entities;

public class Manager extends Employee{
    private double responsibleSalary;

    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    public Manager(String name, int id, double salary, double responsibleSalary) {
        super(name, id, salary);
        this.responsibleSalary = responsibleSalary;
    }

    public double getResponsibleSalary() {
        return responsibleSalary;
    }

    public void setResponsibleSalary(double responsibleSalary) {
        this.responsibleSalary = responsibleSalary;
    }

    public void setNewSalary() {
        setSalary(responsibleSalary*getSalary()) ;
    }
}
