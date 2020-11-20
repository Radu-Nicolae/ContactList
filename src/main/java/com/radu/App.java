package com.radu;

import com.radu.contacts.Contact;
import com.radu.contacts.Database;
import com.radu.utilities.AppUtilities;
import com.radu.utilities.Print;
import com.radu.utilities.options.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    static Scanner scn = new Scanner(System.in);

    public void runApp(List<Contact> contacts) {
        Print.printWhatToDo();

        String input;
        boolean isInputInvalid = true;

        System.out.print("\nYour choice: ");


        do {
            input = scn.next();
            if (input.equalsIgnoreCase("1") || input.equalsIgnoreCase("2") ||
                    input.equalsIgnoreCase("3") || input.equalsIgnoreCase("4") ||
                    input.equalsIgnoreCase("5")) {
                isInputInvalid = false;
            } else {
                System.out.print("Please enter a valid input: ");
            }
        }
        while (isInputInvalid);

        switch (input) {
            case "1":
                Option1.runOption1(contacts);
                break;
            case "2":
                Option2.runOption2(contacts);
                break;
            case "3":
                contacts = Option3.runOption3(contacts);
                break;
            case "4":
                contacts = Option4.runOption4(contacts);
                break;
            case "5":
                contacts = Option5.runOption5(contacts);
                break;


        }
    }
}
