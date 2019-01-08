package Controller;

import Model.BookstoreManager;
import View.View;

public class Controller {

    private BookstoreManager model;
    private View view;

    private Controller() {
        this.model = new BookstoreManager();
        this.view = new View();

        control();
    }

    private static Controller instance;

    public static Controller getInstance(){
        if(instance == null){
            instance = new Controller();
        }
        return instance;
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
