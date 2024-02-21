package sk.jozef.io.kontaktDatabaza;

public class Main {
    /**
     * The main method to demonstrate adding a contact to the database.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Creating an instance of ContactsDatabase
        ContactsDatabase database = new ContactsDatabase("C:\\Users\\jozef\\Downloads\\JavaPokrocily\\src\\zoznamkontaktov.txt");
        // Creating a new contact
        Contact newContact = new Contact("Jozef Bednar", "0950114523", "", "jozef.1bednar@gmail.com");

        Contact newContact2 = new Contact("Ferko Radko","","36522014","nema");

        // Adding the new contact to the database
        database.addContact(newContact);
        database.addContact(newContact2);
    }
}
