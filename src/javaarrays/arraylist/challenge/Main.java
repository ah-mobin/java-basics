package javaarrays.arraylist.challenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0096 5589 7748");

    public static void main(String[] args){
        boolean quit = false;
        startPhone();
        printActions();

        while (!quit){
            System.out.println("\nEnter action: (6 to available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("\nShutting down...");
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

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }
        }
    }


    public static void printContacts(){
        mobilePhone.printContacts();
    }


    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: " + name + " phone: " + phone);
        }else{
            System.out.println("Cannot added, " + name + " already on file");
        }
    }


    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName, phone);
        if(mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfully updated the record");
        }else{
            System.out.println("Error updating record");
        }
    }

    private static void removeContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully removed the record");
        }else{
            System.out.println("Error deleting record");
        }

    }


    private static void queryContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());

    }


    private static void startPhone(){
        System.out.println("Starting phone ....");
    }

    private static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown the program.\n" +
                           "1 - to print contacts.\n" +
                           "2 - to add new contact.\n" +
                           "3 - to update existing contact.\n" +
                           "4 - to remove a contact.\n" +
                           "5 - query if an existing contact exists.\n" +
                           "6 - to print available actions."
        );

        System.out.println("Choose your action");
    }
}
