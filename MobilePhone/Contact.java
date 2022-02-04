public class Contact {
    private String contactName;
    private String contactSurname;
    private String contactPhone;

    public Contact(String contactName, String contactSurname, String contactPhone) {
        this.contactName = contactName;
        this.contactSurname = contactSurname;
        this.contactPhone = contactPhone;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactSurname() {
        return contactSurname;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public static Contact createContact(String name, String surname, String phoneNumber) {
        return new Contact(name, surname, phoneNumber);
    }
}
