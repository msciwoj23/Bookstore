package MainPackage.Model;

import java.util.LinkedList;

public class Film extends Item {

    private int durationTime;

    public Film(String title, int amount, int price, int durationTime, LinkedList<Item> relatedItems) {
        super(title, amount, price, relatedItems);

        this.durationTime = durationTime;
    }
}
