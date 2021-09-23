import java.util.ArrayList;

public class Customer {
    private String customerName;
    private String customerSurname;
    private String customerPhoneNumber;
    private int customerAccountNumber;
    private int customerAccountBalance;
    private ArrayList<Integer> transactions;

    public Customer(String customerName, String customerSurname, String customerPhoneNumber, int customerAccountNumber, int customerAccountBalance) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerAccountNumber = customerAccountNumber;
        this.customerAccountBalance = customerAccountBalance;
        this.transactions = new ArrayList<Integer>();
    }
}


