package Model;

import java.util.LinkedList;

public class Game extends Item{

    private int ageRestriction;

    public Game(String title, int amount, int price, int ageRestriction) {
        super(title, amount, price);

        this.ageRestriction = ageRestriction;
    }

    @Override
    public int getSpecialProperties() {
        return ageRestriction;
    }
}
