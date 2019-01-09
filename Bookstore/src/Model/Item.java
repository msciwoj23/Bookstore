package Model;


public abstract class Item {

    private String title;
    private int amount;
    private int price;


    public Item(String title, int amount, int price) {
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

    public int getPrice() {
        return price;
    }

    public abstract int getSpecialProperties();
}
