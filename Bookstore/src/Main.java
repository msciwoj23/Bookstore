import Controller.Controller;
import Model.User;

public class Main {

    public static void main (String[] args) {
        System.out.println("Starting...");

        Controller.getInstance().control();
    }
}

/*
        all items have: title, in-stock-amount, price

        types of products: books, films, games

        books have: number of pages
        films have: length
        games have: age limit

        all products have option to be related to one or more other products

        optionally product can be a member of a collection

        products can be ordered by users.
        user can select item and quantity.
        availability of items must be considered while ordering.
        user can view his chosen items.
        after placing order, stock level is reduced.

        user with administrative rights can add, delete and edit offered items.
 */
