package BuilderPattern.AnotherBuilderPattern;

/**
 * Created by ahmetatalay on 03/08/16.
 */
public class Car {
    private int wheels;
    private String color;
    private String gear;
    private String brand;


    public Car(String brand,String color, String gear) {
        this.color = color;
        this.gear = gear;
        this.brand = brand;
        this.wheels = 4;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", color='" + color + '\'' +
                ", gear='" + gear + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
