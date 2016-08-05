package BuilderPattern.demo;

import BuilderPattern.builder.MealBuilder;
import BuilderPattern.meal.Meal;

/**
 * Created by ahmetatalay on 01/08/16.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: "+ vegMeal.getCost());

        System.out.println();

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: "+ nonVegMeal.getCost());


    }
}
