package LabMore.entities;

import LabMore.service.CustomerService;

public class Bill {
        private Customer customerInfo ;
        private double prePowerCount;
        private double powerCount;
        private double billMoney;

    public Bill() {
        CustomerService service = new CustomerService();
        this.customerInfo = service.inputCustomer();
    }

    public Customer getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(Customer customerInfo) {
        this.customerInfo = customerInfo;
    }

    public double getPrePowerCount() {
        return prePowerCount;
    }

    public void setPrePowerCount(double prePowerCount) {
        this.prePowerCount = prePowerCount;
    }

    public double getPowerCount() {
        return powerCount;
    }

    public void setPowerCount(double powerCount) {
        this.powerCount = powerCount;
    }

    public double getBillMoney() {
        return billMoney;
    }

    public void setBillMoney() {
        this.billMoney = ((getPowerCount()-getPrePowerCount())*750);
    }

    @Override
    public String toString() {
        return "Bill cua: " +
                customerInfo +
                ", prePowerCount=" + prePowerCount +
                ", newPowerCount=" + powerCount +
                ", billMoney=" + billMoney +
                "\n";
    }
}
