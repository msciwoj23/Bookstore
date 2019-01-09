package Model;

import java.util.LinkedList;

public class BookstoreManager {

    public LinkedList<Item> listOfItems = new LinkedList<>();
    public LinkedList<Item> itemsInCart = new LinkedList<>();

    public static void updateUserStatus() {

    }

    public void addItemToBookstore(Item item) {
        listOfItems.add(item);
    }

    public void addItemToCart(Item item) {
        itemsInCart.add(item);

    }

    public void updateStock() {

    }

    public void editItem() {

    }

    public void removeItem(Item item) {
        listOfItems.remove(item);
    }
}
