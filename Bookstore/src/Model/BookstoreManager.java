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
        for(Item item : itemsInCart){
            int index = listOfItems.indexOf(item.getTitle());
            decrementItemsAmountByOne(listOfItems.get(index));
        }
    }

    public void editItem(String name, InputHandler userInput) {
        int index = listOfItems.indexOf(name);
        listOfItems.get(index).setPrice(userInput.validatedNextInt("Give me price"));
    }

    public void removeItem(Item item) {
        listOfItems.remove(item);
    }

    private void decrementItemsAmountByOne(Item item){
        item.setAmount(item.getAmount() - 1);
    }
}
