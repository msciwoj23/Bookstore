package Controller;

import Model.BookstoreManager;
import View.View;

public class Controller {

    private BookstoreManager model;
    private View view;

    public Controller() {
        this.model = new BookstoreManager();
        this.view = new View();

        control();
    }

    public void control() {

//        view.printMenu();
//        int code = view.getCh();
//        System.out.println(code);
//        int code2 = view.getCh();
//        System.out.println(code2);

        view.printGreeting();

        view.printLoginScreen();
        BookstoreManager.updateUserStatus();
        view.printMenu();

        while (true) {
            char input = view.getCh();

//            boolean condition = true;
//
//            if(condition) {
//                view.printMenu();
//            } else {
//                view.printItems();
//            }

            switch (input) {
                case 'a':
                    view.printMenu();
                    break;
                case 'b':
                    System.out.println("bam");
                    break;

            }
        }
    }
}
