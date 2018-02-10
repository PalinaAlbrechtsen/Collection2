package Homework.second;

public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage();
        CamelsCar firstCar = new CamelsCar("Mersedes", "Benz", 1999, "sedan",
                "yellow", 500, 3);
        CamelsCar secondCar = new CamelsCar("Mersedes", "CL", 2017, "sedan",
                "baklazhan", 5968, 4);
        CatsCar thirdCar = new CatsCar("Audi", "a8", 2017, "sedan",
                "white", 9869, 4);
        CatsCar fourthCar = new CatsCar("Audi", "a4", 2016, "coop",
                "blue", 5745, 2);
        CatsCar tractor = new CatsCar("Tractor", "6754", 1900, "type",
                "red", 456, 1);
        DogsCar fifthCar = new DogsCar("Jeep", "5", 2003, "Jeep",
                "green", 4958, "wooden");
        CamelsCar sixthCar = new CamelsCar("Buick", "CASCADA", 2017, "sedan",
                "red", 33065, 4);
        FrogsCar seventhCar = new FrogsCar("BMW", "3", 1986, "universal",
                "red", 53, "Frog");

        garage.parking(seventhCar);
        garage.parking(seventhCar);
        garage.parking(seventhCar);
        garage.parking(seventhCar);

        garage.parking(firstCar);
        garage.parking(secondCar);
        garage.parking(thirdCar);
        garage.parking(fourthCar);
        garage.parking(fifthCar);
        garage.parking(tractor);

        garage.showCarsInGarage();
        System.out.println("Автомобилей вида CatsCar в гараже: " + garage.takeTheCountOfCars(new CatsCar()));
        garage.carOut(tractor);
        garage.carOut(sixthCar);
        System.out.println("Автомобилей вида CatsCar в гараже: " + garage.takeTheCountOfCars(new CatsCar()));
        System.out.println("Автомобилей " + seventhCar.toString() + " в гараже "
                + garage.takeTheCountOfTheSameCars(seventhCar));
        garage.carOut(seventhCar);
        System.out.println("Автомобилей " + seventhCar.toString() + " в гараже "
                + garage.takeTheCountOfTheSameCars(seventhCar));
        System.out.println("Всего автомобилей в гараже: " + garage.countOfCarsInGarage());
    }
}
