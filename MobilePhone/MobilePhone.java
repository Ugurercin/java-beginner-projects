import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact) {
        if(findContact(contact.getContactPhone()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if(position < 0) {
            System.out.println(oldContact.getContactName() + " was not found.");
            return false;
        }

        this.myContacts.set(position, newContact);
        System.out.println(oldContact.getContactName() + " is replaced with " + newContact.getContactName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if(position < 0) {
            System.out.println(contact.getContactName() + " was not found.");
            return false;
        }
        this.myContacts.remove(position);
        System.out.println(contact.getContactName() + " is deleted.");
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactPhone) {
        for(int i = 0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getContactPhone().equals(contactPhone)){
                return i;
            }
        }

        return -1;
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getContactName();
        }

        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >= 0) {
            return this.myContacts.get(position);
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for(int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i+1) + "." +
                    this.myContacts.get(i).getContactName() + ", " +
                    this.myContacts.get(i).getContactSurname() + " ->" +
                    this.myContacts.get(i).getContactPhone());
        }
    }




}
