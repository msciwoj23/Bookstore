package Model;

import java.util.LinkedList;

public class Game extends Item{

    private int ageRestriction;

    public Game(String title, int amount, int price, int ageRestriction, LinkedList<Item> relatedItems) {
        super(title, amount, price, relatedItems);

        this.ageRestriction = ageRestriction;
    }
}
