package Model;

import java.util.LinkedList;

public class Game extends Item{

    private int ageRestriction;

    public Game(String title, int amount, int price, LinkedList<String> relatedItems, int ageRestriction) {
        super(title, amount, price, relatedItems);

        this.ageRestriction = ageRestriction;
    }

    @Override
    public int getSpecialProperties() {
        return ageRestriction;
    }
}
