package BuilderPattern.drink;

import BuilderPattern.meal.Item;
import BuilderPattern.meal.Packing;

/**
 * Created by ahmetatalay on 01/08/16.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
