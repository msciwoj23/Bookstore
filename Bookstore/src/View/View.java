package View;

import Model.Book;
import Model.Item;

import java.util.Arrays;
import java.util.LinkedList;


public class View {

    public char getCh() {
        return Special.getCh();
    }

    public String getStringInput() {
        return "Non valid!";
    }

    public Item getItemInput() {
        LinkedList<Item> relatedItems = new LinkedList<Item>();

        return new Book("ex", 0, 0, 0, relatedItems);
    }

    public void printGreeting() {

    }

    public void printLoginScreen() {

    }

    public void printMenu() {

        System.out.println("      *one*        ");
        System.out.println("       two         ");
        System.out.println("       three       ");
        System.out.println("       four        ");

    }

    public void printCurrentCart() {

    }

    public void printItems() {

    }
}
