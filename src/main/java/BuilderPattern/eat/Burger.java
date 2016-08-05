package BuilderPattern.eat;

import BuilderPattern.meal.Item;
import BuilderPattern.meal.Packing;

/**
 * Created by ahmetatalay on 01/08/16.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
