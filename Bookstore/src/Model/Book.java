package Model;

import java.util.LinkedList;

public class Book extends Item{

    private int numberOfPages;

    public Book(String title, int amount, int price, int numberOfPages, LinkedList<Item> relatedItems) {
        super(title, amount, price, relatedItems);

        this.numberOfPages = numberOfPages;
    }
}
