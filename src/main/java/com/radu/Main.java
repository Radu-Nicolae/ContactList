package com.radu;

import com.radu.contacts.Database;
import com.radu.utilities.Print;

public class Main {

    //TODO: The program will have a contacts with:
    //1. id
    //2. full name
    //3. phone number
    //4. email address
    //5. address
    //Contacts's name will be added using a Faker, as well as their address.
    //Phone will be generated randomly and their emails will be fullnames@gmail.com

    //1. TODO: The user will see only full name and phone number
    //2. TODO: The user will have the possibility to see more details about the contact

    //3. TODO: The user will be able to modify contact's details

    //4. TODO: The user will be able to add a contact
    //5. TODO: The user will be able to delete a contact

    public static void main(String[] args) {
        App app = new App();

        Print.printWelcome();
        app.runApp(Database.getContacts());
    }
}
