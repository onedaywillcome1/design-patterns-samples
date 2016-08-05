package BuilderPattern.eat;

import BuilderPattern.meal.Packing;

/**
 * Created by ahmetatalay on 01/08/16.
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
