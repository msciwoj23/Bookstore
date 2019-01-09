package MainPackage.Model;

import java.util.LinkedList;

public abstract class Item {

    private String title;
    private int amount;
    private int price;
    private LinkedList<Item> relatedItems;

    public Item(String title, int amount, int price, LinkedList<Item> relatedItems) {
        this.title = title;
        this.amount = amount;
        this.price = price;
        this.relatedItems.addAll(relatedItems);
    }
}
