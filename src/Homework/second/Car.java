package Homework.second;

public abstract class Car {

    String mark;
    String model;
    Integer year;
    String type;
    String color;
    Integer prise;

    public Car() {
    }

    public Car(String mark, String model, Integer year, String type, String color, Integer prise) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.type = type;
        this.color = color;
        this.prise = prise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (mark != null ? !mark.equals(car.mark) : car.mark != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (year != null ? !year.equals(car.year) : car.year != null) return false;
        if (type != null ? !type.equals(car.type) : car.type != null) return false;
        if (color != null ? !color.equals(car.color) : car.color != null) return false;
        return prise != null ? prise.equals(car.prise) : car.prise == null;
    }

    @Override
    public int hashCode() {
        int result = mark != null ? mark.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (prise != null ? prise.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "марка='" + mark + '\'' +
                ", модель='" + model + '\'' +
                ", год=" + year +
                ", тип кузова='" + type + '\'' +
                ", цвет='" + color + '\'' +
                ", цена=" + prise;
    }
}

