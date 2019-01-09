package MainPackage.View;

import MainPackage.Model.Book;
import MainPackage.Model.Item;
import MainPackage.Special;

import java.util.Scanner;
import java.util.LinkedList;


public class View {

    public char getCh() {
        return Special.getCh();
    }

    public String getStringInput() {

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println();
        System.out.println("      password: ");
        String s = reader.next();
                        //once finished
        reader.close();
        return s;
    }

    public Item getItemInput() {
        LinkedList<Item> relatedItems = new LinkedList<Item>();

        return new Book("ex", 0, 0, 0, relatedItems);
    }

    public void printVisualSeparator() {
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();
    }

    public void printGreeting() {
        printVisualSeparator();
        System.out.println("      **** Welcome to Bookstore™! ****");
        System.out.println();
        System.out.println("      press any key to continue");
    }

    public void printLoginScreen() {
        printVisualSeparator();
        System.out.println("      type password for administrator functions fallowed by Enter");
        System.out.println();
        System.out.println("      or just press Enter to continue");
    }

    public void printWrongPasswordMessage() {
        printVisualSeparator();
        System.out.println("      wrong password, redirecting to Main Menu");
        System.out.println();
        System.out.println("      press any key to continue");
    }

    public void printMenu() {
        System.out.println("       press number shown in square brackets to navigate:");
        System.out.println();
        System.out.println("[1]    browse books");
        System.out.println("[2]    browse films");
        System.out.println("[3]    browse games");
        System.out.println("[4]    browse all items");
        System.out.println("[5]    show cart");
        System.out.println();
    }

    public void printUserMenuSuffix() {
        System.out.println("[6]    login as administrator");
        System.out.println("[0]    exit application");
    }

    public void printAdminMenuSuffix() {
        System.out.println("[6]    login as user");
        System.out.println("[0]    exit application");
    }

    public void printAdminMenuPrefix() {
        printVisualSeparator();
        System.out.println("       this is MAIN MENU -- administrator rights granted");
    }

    public void printUserMenuPrefix() {
        printVisualSeparator();
        System.out.println("       this is MAIN MENU");
    }

    public void printCurrentCart(LinkedList<Item> cart) {
        printVisualSeparator();
    }

    public void printItems(LinkedList<Item> items) {
        printVisualSeparator();
    }

    public void printFarewell() {
        printVisualSeparator();
        System.out.println("      Thank you for using Bookstore™ by BoxCode");
    }
}
