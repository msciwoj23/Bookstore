package Model;

import java.util.Arrays;
import java.util.LinkedList;

public class BookstoreManager {

    private boolean isUserTheAdmin = false;
    private String password = "mama";

    private LinkedList<Item> listOfItems = new LinkedList<>();
    private LinkedList<Item> itemsInCart = new LinkedList<>();

    public void addItemToBookstore(Item item) {
        listOfItems.add(item);
    }

    public void addItemToCart(Item item) {
        itemsInCart.add(item);
    }

    public void updateStock() {
        for (Item item : itemsInCart) {
            int index = listOfItems.indexOf(item.getTitle());
            decrementItemsAmountByOne(listOfItems.get(index));
        }
    }

//    public void editItem(String name, InputHandler userInput) {
//        int index = listOfItems.indexOf(name);
//        listOfItems.get(index).setPrice(userInput.validatedNextInt("Give me price"));
//    }

    public void removeItem(Item item) {
        listOfItems.remove(item);
    }

    private void decrementItemsAmountByOne(Item item) {
        item.setAmount(item.getAmount() - 1);
    }

    public Item createItemFromInput(String input){
        String[] splitItem = input.split(";");
        System.out.println(Arrays.toString(splitItem));
        int price = Integer.parseInt(splitItem[2]);
        int amount = Integer.parseInt(splitItem[3]);
        int specialAtribiute = Integer.parseInt(splitItem[4]);
        Item elementFromUserInput = null;

        if(splitItem[0].equals("Book")) {
            System.out.println("Book");
            elementFromUserInput = new Book(splitItem[1],price,amount,specialAtribiute);
        }
        else if(splitItem[0].equals("Film")){
            System.out.println("Film");
            elementFromUserInput = new Film(splitItem[1],price,amount,specialAtribiute);
        }
        else if(splitItem[0].equals("Game")){
            System.out.println("Game");
            elementFromUserInput = new Game(splitItem[1],price,amount,specialAtribiute);
        }
        else {
            System.out.println("Wrong input");
        }
        return elementFromUserInput;
    }


    public LinkedList<Item> getListOfItems() {
        return listOfItems;
    }

    public LinkedList<Item> getItemsInCart() {
        return itemsInCart;
    }

    public boolean isUserTheAdmin() {
        return isUserTheAdmin;
    }

    public boolean isPasswordOk(String inputPassword) {
        return password.equals(inputPassword);
    }

    public void toggleUserStatus() {
        isUserTheAdmin = !isUserTheAdmin;
    }

    public LinkedList<Item> getItemsOfOneType(Class type) {
        LinkedList<Item> list = new LinkedList<>();
        for (Item item :
                listOfItems) {
            if (item.getClass() == type) {
                list.add(item);
            }
        }
        return list;
    }
}

