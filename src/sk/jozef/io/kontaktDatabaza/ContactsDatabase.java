package sk.jozef.io.kontaktDatabaza;

import java.io.*;
/**
 * This class represents a simple contacts database that allows adding new contacts to a text file.
 */

public class ContactsDatabase {

    private  String filePath;

    /**
     * Constructs a new ContactsDatabase object with the specified file path.
     * @param filePath The file path to the contacts database file.
     */

    public ContactsDatabase(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Adds a new contact to the contacts database file.
     * @param contact The contact to be added.
     */

    public void addContact(Contact contact){
        try {
            // Načítanie existujúcich kontaktov
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String databaseName = reader.readLine();
            String contactCountStr = reader.readLine();
            // Parse the contact count, handle the case when the string is empty
            int contactCount = contactCountStr.isEmpty() ? 0 : Integer.parseInt(contactCountStr);
            String header = reader.readLine();
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            // Increase the contact count
            contactCount++;

            // Add the new contact
            content.append(contact.toString()).append("\n");

            // Write back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(databaseName + "\n");
            writer.write(contactCount + "\n");
            writer.write(header + "\n");
            writer.write(content.toString());
            writer.close();

            System.out.println("Contact has been successfully added to the database.");
        } catch (IOException e) {
            System.err.println("Error while working with the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error while parsing the number: " + e.getMessage());
        }
    }
}
