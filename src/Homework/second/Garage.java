package Homework.second;

import java.util.HashMap;
import java.util.Map;

public class Garage<T> {

    Map<Car, Integer> cars = new HashMap<>();

    public void parking(Car car) {
        int value = 1;
        if (cars.containsKey(car)) {
            value = cars.get(car) + 1;
        }
        cars.put(car, value);
    }

    public void carOut(Car car) {
        if (cars.containsKey(car)) {
            if (cars.get(car) == 1) {
                cars.remove(car);
            } else {
                int value = cars.get(car) - 1;
                cars.put(car, value);
            }
        } else {
            System.out.println("Автомобиля марки " + car.mark + ", модели " + car.model + ", "
                    + car.year + " года нет в гараже :(");
        }
    }

    public int takeTheCountOfTheSameCars(Car car) {
        return cars.get(car);
    }

    public int takeTheCountOfCars(T obj) {
        int count = 0;
        for (Car car : cars.keySet()) {
            if (car.getClass() == obj.getClass()) {
                count++;
            }
        }

        return count;
    }

    public void showCarsInGarage() {
        System.out.println("Автомобили в гараже:");
        for (Car car : cars.keySet()) {
            System.out.println(car);
        }
    }

    public int countOfCarsInGarage() {
        int count = 0;
        for (Car car : cars.keySet()) {
            count += cars.get(car);
        }

        return count;
    }
}
