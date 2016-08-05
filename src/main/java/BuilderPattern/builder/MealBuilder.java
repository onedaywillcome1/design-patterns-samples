package BuilderPattern.builder;

import BuilderPattern.meal.Meal;
import BuilderPattern.eat.ChickenBurger;
import BuilderPattern.eat.VegBurger;
import BuilderPattern.drink.Coke;
import BuilderPattern.drink.Pepsi;

/**
 * Created by ahmetatalay on 01/08/16.
 */
public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
