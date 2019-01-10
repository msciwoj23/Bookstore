package Model;

import java.util.LinkedList;

public class Book extends Item{

    private int numberOfPages;


    public Book(String title, int amount, int price, int numberOfPages) {
        super(title, amount, price);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public int getSpecialProperties() {
        return numberOfPages;
    }
}
