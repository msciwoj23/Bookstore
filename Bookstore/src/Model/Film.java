package Model;

import java.util.LinkedList;

public class Film extends Item {

    private int durationTime;

    public Film(String title, int amount, int price, int durationTime) {
        super(title, amount, price);

        this.durationTime = durationTime;
    }

    @Override
    public int getSpecialProperties() {
        return durationTime;
    }
}
