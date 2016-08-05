package BuilderPattern.AnotherBuilderPattern;

/**
 * Created by ahmetatalay on 03/08/16.
 */
public class AnotherBuilderPatternDemo {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();

        Car bmwCar = carBuilder.setBrand("BMW")
                                .setColor("green")
                                .setGear("automatic").build();

        Car mercedesCar = carBuilder.setBrand("Mercedes")
                                    .setColor("blue")
                                    .setGear("normal").build();

        CarDirector carDirector = new CarDirector();
        carDirector.buyCar(bmwCar,mercedesCar);
        carDirector.showCars();
        carDirector.sellCar(mercedesCar);
        carDirector.showCars();
    }
}
