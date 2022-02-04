import java.sql.SQLOutput;
import java.util.Scanner;

public class MainPhone {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("551 243 232");
    public static void main(String[] args) {

        boolean quit = false;
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                //case 5:
                    //queryContact();
                    //break;

                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Please enter a contact name:");
        String name = scanner.nextLine();
        System.out.println("Please enter a surname:");
        String surname = scanner.nextLine();
        System.out.println("Please enter a phone number:");
        String phoneNumber = scanner.nextLine();
        Contact contact = Contact.createContact(name, surname, phoneNumber);
        if(mobilePhone.addContact(contact)) {
            System.out.println("New contact added.");
        } else {
            System.out.println("Can not add " + contact.getContactPhone() + " already on file.");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact can not found");
            return;
        }

        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact surname");
        String surName = scanner.nextLine();
        System.out.println("Enter a contact phoneNumber");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, surName, phoneNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact can not found");
            return;
        }

        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }



    private static void printContacts() {
        System.out.println("Your contact list");
        mobilePhone.printContacts();
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                           "2 - add a new contact\n" +
                           "3 - to update existing contact\n" +
                           "4 - to remove an existing contact\n" +
                           "5 - query if an existing contact exists\n" +
                           "6 - to print a list of available actions.");
        System.out.println("Choose your action:");
    }
}
