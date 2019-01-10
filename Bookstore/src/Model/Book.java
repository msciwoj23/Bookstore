package Model;

import java.util.LinkedList;

public class Book extends Item{

    private int numberOfPages;


    public Book(String title, int amount, int price, LinkedList<String> relatedItems, int numberOfPages) {
        super(title, amount, price, relatedItems);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public int getSpecialProperties() {
        return numberOfPages;
    }
}
