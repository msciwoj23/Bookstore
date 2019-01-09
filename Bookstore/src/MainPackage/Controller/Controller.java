package MainPackage.Controller;

import MainPackage.Model.BookstoreManager;
import MainPackage.Special;
import MainPackage.View.View;

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

        for (int i = 0; i < 100; i++) {
            System.out.println(Special.generateId());
        }

        view.printGreeting();
        view.getCh();

        view.printLoginScreen();
        String loginScreenInput = view.getStringInput();

        if (model.isPasswordValid(loginScreenInput)) {
            model.updateUserStatus();
        } else if (loginScreenInput.length() == 0) {
        } else {
            view.printWrongPasswordMessage();
            view.getCh();
        }
        view.printMenu();

        boolean shouldExit = false;
        while (!shouldExit) {
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

                case '0':
                    view.printFarewell();
                    shouldExit = true;
                    break;

            }
        }
    }
}
