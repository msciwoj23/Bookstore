package Model;

import java.util.LinkedList;

public class BookstoreManager {

    LinkedList<Item> listOfItems;

    LinkedList<Item> itemsInCart;

    public static void updateUserStatus() {

    }

    public void addItemToBookstore() {

    }

    public void addItemToCart() {

    }

    public void updateStock() {
        for(Item item : itemsInCart){
            int index = listOfItems.indexOf(item.getTitle());
            decrementItemsAmountByOne(listOfItems.get(index));
        }
    }

    public void editItem(String name, InputHandler userInput) {
        int index = listOfItems.indexOf(name);
        listOfItems.get(index).setPrice(userInput.validatedNextInt("Give me price"));
    }

    public void addItem() {

    }

    public void removeItem() {

    }

    private void decrementItemsAmountByOne(Item item){
        item.setAmount(item.getAmount() - 1);
    }
}
