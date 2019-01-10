package View;

import Model.Book;
import Model.Item;
import jdk.internal.joptsimple.internal.Strings;

import java.util.Scanner;
import java.util.LinkedList;


public class View {

    public String getStringInput() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);  // Reading from System.in
        System.out.println("        Type:");
        String s = scanner.next();
        // scanner.close();
        return s;
    }

    public void printItemAdditionMessage() {
        System.out.println();
        System.out.println("        If you wish to add an item, read and pay attention:");
        System.out.println();
        System.out.println("        You have to describe item's:");
        System.out.println();
        System.out.println("        type;title;number in stock;price;SPECIAL property");
        System.out.println();
        System.out.println("        separated by semicolons like above.");
        System.out.println("        SPECIAL property means: number of pages  - if it's a book");
        System.out.println("                                minutes it lasts - if it's a film");
        System.out.println("                                age restriction  - if it's a game");
        System.out.println();
        System.out.println("        use semicolon (;) 4 times to separate 5 properties. Example:");
        System.out.println("        Book;The Hobbit;20;40;230");

        System.out.println("        leave no space between semicolons to skip property, example:");
        System.out.println();
        System.out.println("        Book;Book of Unknown Properties;;;;230");
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
        System.out.println("      type any key to continue");
    }

    public void printLoginScreen() {
        printVisualSeparator();
        System.out.println("      type password for administrator functions fallowed by Enter");
        System.out.println();
        System.out.println("      or any key to continue");
    }

    public void printWrongPasswordMessage() {
        printVisualSeparator();
        System.out.println("      wrong password, redirecting to Main Menu");
        System.out.println();
        System.out.println("      press Enter to continue");
    }

    public void printMenu() {
        System.out.println("      type word in square brackets to navigate:");
        System.out.println();
        System.out.println("[books]    browse books");
        System.out.println("[films]    browse films");
        System.out.println("[games]    browse games");
        System.out.println("[all]      browse all items");
        System.out.println();
        System.out.println("[cart]     show cart");
        System.out.println("[order]    order all items in cart");
        System.out.println("[admin]    login/logout as administrator");
        System.out.println();
        System.out.println("[exit]     exit application");
    }

    public void printAdminMenuSuffix() {
        System.out.println();
        System.out.println("[item]     add item to store");

    }

    public void printAdminMenuPrefix() {
        printVisualSeparator();
        System.out.println("       this is MAIN MENU -- ADMINISTRATOR rights granted");
    }

    public void printUserMenuPrefix() {
        printVisualSeparator();
        System.out.println("       this is MAIN MENU");
    }

    public void printItems(LinkedList<Item> items) {
        final String DASHES = new String(new char[175]).replace("\0", "-");
        System.out.println(DASHES);
        System.out.print(String.format("|%-30s|","Type"));
        System.out.print(String.format("%-30s|","Title"));
        System.out.print(String.format("%-30s|", "Price"));
        System.out.print(String.format("%-30s|", "Amount"));
        System.out.println(String.format("%-50s|", "Number of Pages/ Duration Time/ Restriction Ages"));
        System.out.println(DASHES);
        if (!items.isEmpty()) {
            for (Item element : items) {
                System.out.print(String.format("|%-30s|",element.getClass().getSimpleName()));
                System.out.print(String.format("%-30s|", element.getTitle()));
                System.out.print(String.format("%-30s|", element.getPrice()));
                System.out.print(String.format("%-30s|", element.getAmount()));
                System.out.println(String.format("%-50s|", element.getSpecialProperties()));
                System.out.println(DASHES);
            }
        } else {
            System.out.println("Out of stock");
        }

    }

    public void printFarewell() {
        printVisualSeparator();
        System.out.println("      Thank you for using Bookstore™ by BoxCode");
    }
}
