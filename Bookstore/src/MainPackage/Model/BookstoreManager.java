package MainPackage.Model;

import java.util.HashMap;
import java.util.LinkedList;

public class BookstoreManager {

    private String password = "Mama";
    private boolean amITheAdmin;

    LinkedList<Item> listOfItems;

    LinkedList<Item> itemsInCart;

    HashMap mapOfItems = new HashMap();

    public void updateUserStatus() {
        this.amITheAdmin = !amITheAdmin;
    }

    public boolean isPasswordValid(String loginScreenInput) {
        return password.equals(loginScreenInput);
    }

    public void addItemToBookstore() {

    }

    public void addItemToCart() {

    }

    public void updateStock() {

    }

    public void editItem() {

    }

    public void addItem() {

    }

    public void removeItem() {

    }
}
