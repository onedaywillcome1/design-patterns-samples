package BuilderPattern.AnotherBuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmetatalay on 03/08/16.
 */
public class CarBuilder {
    private List<Car> carList = new ArrayList<Car>();

    private String color;
    private String gear;
    private String brand;

    public CarBuilder() {
    }

    public String getColor() {
        return color;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public String getGear() {
        return gear;
    }

    public CarBuilder setGear(String gear) {
        this.gear = gear;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Car build(){
        return new Car(brand,color,gear);
    }

}
