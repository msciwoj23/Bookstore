package Model;


import java.util.LinkedList;

public abstract class Item {

    private String title;
    private int amount;
    private float price;
//    private LinkedList<String> relatedItems;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {

        this.price = price;
    }

    public Item(String title, int amount, float price) {
        this.title = title;
        this.amount = amount;
        this.price = price;
//        this.relatedItems = relatedItems;
    }

    public String getTitle() {
        return title;
    }

    public int getAmount() {
        return amount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

//    public void setRelatedItems(LinkedList<String> relatedItems) {
//        this.relatedItems = relatedItems;
//    }

    public abstract int getSpecialProperties();
}
