package implement;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.inputService();
        account.displayInfo();
        account.recharge();
        account.setEmail(account.changeEmail());
        account.displayInfo();
    }
}
