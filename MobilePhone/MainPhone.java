import java.util.Scanner;

public class MainPhone {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("2134 4213 22");

    public static void main(String[] args) {

        boolean exit = false;
        startPhone();
        printInstructions();
        while (!exit) {
            System.out.println("Choose an action :");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    //break;
                case 5:
                    queryContact();
                    //break;
                case 6:
                    printInstructions();
                    break;
            }
        }


    }

    public static void startPhone() {
        System.out.println("Phone is booting...");
    }

    private static void addNewContact(){
        System.out.println("Please enter a contact name : ");
        String contactName = scanner.nextLine();
        System.out.println("Please enter a contact number : ");
        String phoneNumber = scanner.nextLine();
        Contact contact = Contact.createContact(contactName, phoneNumber);
        if(mobilePhone.addNewContact(contact)){
            System.out.println(contactName + " has been added as a new contact.");
        }
        else{
            System.out.println("Failed to add" + contactName + ", it is already in contacts list.");
        }
    }

    private static void updateContact(){
        System.out.println("Please enter an existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            return;
        }

        System.out.println("Please enter a new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Please enter a new contact number: ");
        String newPhoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhoneNumber);
        mobilePhone.updateContact(existingContact, newContact);
    }

    private static void removeContact(){
        System.out.println("Please enter an existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact was not found.");
            return;
        }

        mobilePhone.removeContact(existingContact);
    }

    private static void queryContact(){
        System.out.println("Please enter an existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact was not found.");
            return;
        }

        System.out.println("Name :" + existingContact.getName() + " phone : " + existingContact.getPhoneNumber());
    }

    private static void printInstructions() {
        System.out.println("\nPlease choose and action :\npress " +
                "0 - to exit\n" +
                "1 - to print the contact list\n" +
                "2 - to add a new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact" +
                "5 - to make a search if a contact exists\n" +
                "6 - to print the instructions list again.");

    }

}