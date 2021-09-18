public class Customer {
    private int id;
    private int accountNumber;

    private double accountBalance;

    private String firstName;
    private String lastName;

    public Customer(int id, int accountNumber, double accountBalance, String firstName, String lastName) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public int getId() {
        return id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
