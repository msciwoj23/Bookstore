package Controller;

import Model.*;
import View.View;

import java.util.LinkedList;

public class Controller {

    private BookstoreManager model;
    private View view;

    public Controller() {
        this.model = new BookstoreManager();
        this.view = new View();

        control();
    }

    private void controlAdminLogin() {
        view.printLoginScreen();
        String inputPassword = view.getStringInput();
        if (model.isPasswordOk(inputPassword)) {
            model.toggleUserStatus();
        }
    }

    private void control() {

        view.printGreeting();
        view.getStringInput();

        controlAdminLogin();


        boolean shouldRun = true;

        while (shouldRun) {

            if (model.isUserTheAdmin()) {
                view.printAdminMenuPrefix();
                view.printMenu();
                view.printAdminMenuSuffix();

            } else {
                view.printUserMenuPrefix();
                view.printMenu();
            }

            String input = view.getStringInput();

            switch (input) {

                case "books":       // TODO comparing strings Bad, Enums good
                    LinkedList<Item> listOfBooks = model.getItemsOfOneType(Book.class);
                    view.printItems(listOfBooks);
                    break;

                case "films":
                    LinkedList<Item> listOfFilms = model.getItemsOfOneType(Film.class);
                    view.printItems(listOfFilms);
                    break;
                                            // TODO this 4 cases are simmilar, should be agregated
                case "games":
                    LinkedList<Item> listOfGames = model.getItemsOfOneType(Game.class);
                    view.printItems(listOfGames);
                    break;

                case "all":
                    LinkedList<Item> itemsToPrint = model.getListOfItems();
                    view.printItems(itemsToPrint);
                    break;

                case "cart":
                    LinkedList<Item> cartItems = model.getItemsInCart();
                    view.printItems(cartItems);
                    break;

                case "purchase":
                    System.out.println("FAIL!!");
                    break;

                case "item":
                    if (model.isUserTheAdmin()) {
                        view.printItemAdditionMessage();
                        String itemDescription = view.getStringInput();
                        Item itemToAdd = model.createItemFromInput(itemDescription);
                        model.addItemToBookstore(itemToAdd);
                        Item lastItem = model.getLastItem();
                        view.printOneItem(lastItem);
                        break;
                    } else {
                        view.printNoRightsMessage();
                        break;
                    }


                case "admin":
                    if (model.isUserTheAdmin()) {
                        model.toggleUserStatus();
                        break;
                    } else {
                        controlAdminLogin();
                        break;
                    }

                case "exit":
                    view.printFarewell();
                    shouldRun = false;
                    break;
            }
        }
    }
}
