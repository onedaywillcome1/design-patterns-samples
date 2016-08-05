package BuilderPattern.AnotherBuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmetatalay on 04/08/16.
 */
public class CarDirector {
    private List<Car> carList = new ArrayList<Car>();

    public CarDirector() {
    }

    public void showCars(){
        if (carList.size()==0){
            System.out.println("There are no cars.");
        }
        else{
            System.out.println("Following cars are listed:");
            for (Car car : carList){
                System.out.println(car.toString());
            }
        }
    }

    public void buyCar(Car... cars){
        for(Car car : cars){
            carList.add(car);
        }
    }

    public void sellCar(Car car){
        System.out.println("Car "+ car.getBrand() +" have sold!");
        carList.remove(car);
    }

    public void sellAllCar(){
        carList.clear();
    }



}
