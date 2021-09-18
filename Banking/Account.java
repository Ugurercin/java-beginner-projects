import java.util.ArrayList;

public class Account {
    private ArrayList<Customer> customers;
    private ArrayList<Account> accounts;
    private int accountNumber;
    private double accountBalance;

    public Account(ArrayList<Customer> customers, int accountNumber, double accountBalance) {
        this.customers = customers;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }



}
