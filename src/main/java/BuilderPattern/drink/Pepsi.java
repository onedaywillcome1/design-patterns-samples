package BuilderPattern.drink;

import BuilderPattern.drink.ColdDrink;

/**
 * Created by ahmetatalay on 01/08/16.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
