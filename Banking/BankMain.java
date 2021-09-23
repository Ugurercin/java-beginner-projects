import java.util.Scanner;

public class BankMain {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int customerChoice = startApp();

        switch (customerChoice){
            case 0:
                createCustomer();
                break;
        }

    }

    //Starting the program and prints the instructions list for the user.
    public static int startApp(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to JavaBank.");
        System.out.println("Please follow the instructions.");
        System.out.println("Press\n " +
                "0 - for creating a new account\n " +
                "1 - for if already an account exists\n " +
                "2 - ");
        System.out.print("Action : ");
        int customerChoice = scanner.nextInt();
        if(customerChoice > 0 && customerChoice < 10){
            return customerChoice;
        }
        else
            System.out.println("Please enter a valid action.");
        startApp();
        return -1;
    }

    private static void createCustomer(){
        String customerName;
        String customerSurname;
        String customerPhoneNumber;
        int customerAccountNumber;
        int customerAccountBalance;

    }
}
