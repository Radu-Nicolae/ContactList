package com.radu.utilities.options;

import com.radu.App;
import com.radu.contacts.Contact;
import com.radu.utilities.Print;

import java.util.List;
import java.util.Scanner;

public class Option5 {

    static App app = new App();
    static Scanner scn = new Scanner(System.in);
    static Contact contact;

    public static List<Contact> runOption5(List<Contact> contacts) {
        Print.printDatabase(contacts);

        System.out.print("\nEnter the index of the contact you want to remove: ");

        String input;
        boolean isInputInvalid = true;
        String index;

        do {
            index = scn.nextLine();
            if ((Integer.parseInt(index) > 0 && Integer.parseInt(index) <= contacts.size())) {
                contact = contacts.get(Integer.parseInt(index) - 1);
                isInputInvalid = false;
            } else {
                System.out.print("Please enter a valid input: ");
            }
        }
        while (isInputInvalid);

        System.out.println("\nYou are about to remove the following contact: ");
        Print.printContact(contact);

        System.out.print("\nConfirm? You answer (yes/no): ");

        isInputInvalid = true;


        do {
            input = scn.nextLine();
            if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no")) {
                isInputInvalid = false;
            } else {
                System.out.print("Please enter a valid input (yes/no): ");
            }
        }
        while (isInputInvalid);


        if (input.equalsIgnoreCase("yes")) {
            System.out.println("\nContact successfully removed!\n\n");
            contacts.remove(contact);
        } else {
            System.out.println("\nThe contact wasn't removed!\n\n");
        }

        app.runApp(contacts);

        return contacts;
    }
}
