package View;



import Model.Book;
import Model.Item;

import java.util.Scanner;
import java.util.LinkedList;


public class View {

    public char getCh() {
        return Special.getCh();
    }

    public String getStringInput() {

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String s = reader.next();
        reader.close();
        return s;
    }

    public String getItemTypeInput() {

        System.out.println();
        System.out.println("What type item would You like to add?");
        System.out.println("Options to type:   book  |  film  |  game");

        return getStringInput();
    }

    public String getBookPropertiesInput() {
        System.out.println();
        System.out.println("Describe your book's details.");
        System.out.println("Type title;number in stock;price;related items;number of pages");
        System.out.println("separated by semicolons. Example:");
        System.out.println("The Hobbit;20;40;Lord of the Rings: Fellowship of the Ring, Lord of the Rings: " +
                "Lord of the Rings: The Two Towers, Lord of the Rings: The Return of the King;230");
        return getStringInput();
    }

    public String getFilmPropertiesInput() {
        System.out.println();
        System.out.println("Describe your film's details.");
        System.out.println("Type title;number in stock;price;related items;time it lasts in minutes");
        System.out.println("separated by semicolons. Example:");
        System.out.println("The Hobbit;20;40;Lord of the Rings: Fellowship of the Ring, Lord of the Rings: " +
                "Lord of the Rings: The Two Towers, Lord of the Rings: The Return of the King;130");
        return getStringInput();
    }

    public String getGamePropertiesInput() {
        System.out.println();
        System.out.println("Describe your game's details.");
        System.out.println("Type title;number in stock;price;related items;age restriction");
        System.out.println("separated by semicolons. Example:");
        System.out.println("The Lord of The Rings, The Battle of the middle-earth II;20;40;Lord of the Rings: Fellowship of the Ring, Lord of the Rings: " +
                "Lord of the Rings: The Two Towers, Lord of the Rings: The Return of the King;12");
        return getStringInput();
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
