package Model;


public abstract class Item {

    private String title;
    private int amount;
    private float price;
    private LinkedList<Item> relatedItems;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {

        this.price = price;
    }

    public Item(String title, int amount, float price, LinkedList<Item> relatedItems) {
        this.title = title;
        this.amount = amount;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getAmount() {
        return amount;
    }

    public abstract int getSpecialProperties();
}
