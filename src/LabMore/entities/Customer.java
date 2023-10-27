package LabMore.entities;

public class Customer {
//Các thông tin riêng của mỗi hộ sử dụng điện gồm: Họ tên chủ hộ, số nhà, mã số công tơ của hộ dân sử dụng điện.
    private String name;
    private int houseId;
    private double powerId;

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public double getPowerId() {
        return powerId;
    }

    public void setPowerId(double powerId) {
        this.powerId = powerId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", houseId=" + houseId +
                ", powerId=" + powerId +
                '}';
    }
}
