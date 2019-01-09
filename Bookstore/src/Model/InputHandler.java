package Model;

import java.util.Scanner;

public class InputHandler {
    Scanner sc = new Scanner(System.in);


    public float validatedNextInt(String message) {

        float userInput;
        do {
            System.out.println(message);
            while (!sc.hasNextFloat()) {
                System.out.println(message);
                sc.next();
            }
            userInput = sc.nextFloat();
        } while (userInput <= 0);

        return userInput;
    }
}
