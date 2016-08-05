package BuilderPattern.drink;

import BuilderPattern.meal.Packing;

/**
 * Created by ahmetatalay on 01/08/16.
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
