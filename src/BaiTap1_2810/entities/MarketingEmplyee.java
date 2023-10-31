package BaiTap1_2810.entities;

public class MarketingEmplyee extends Employee{
    private int saleNumber;
    private double salePercent;

    public MarketingEmplyee(String name, int id, double salary) {
        super(name, id, salary);
    }

    public MarketingEmplyee(String name, int id, double salary, int saleNumber, double salePercent) {
        super(name, id, salary);
        this.saleNumber = saleNumber;
        this.salePercent = salePercent;
    }

    public int getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(int saleNumber) {
        this.saleNumber = saleNumber;
    }

    public double getSalePercent() {
        return salePercent;
    }

    public void setSalePercent(double salePercent) {
        this.salePercent = salePercent;
    }

    public void setNewSalary() {
        double newSalary;
        newSalary = (getSalary() + (getSalary()*getSalePercent()));
        setSalary(newSalary);
    }

    @Override
    public String toString() {
        return "MarketingEmplyee{" +
                "saleNumber=" + saleNumber +
                ", salePercent=" + salePercent +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
