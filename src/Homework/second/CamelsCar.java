package Homework.second;

public class CamelsCar extends Car {

    private Integer wheels;

    public CamelsCar(String mark, String model, Integer year, String type, String color, Integer prise, Integer wheels) {
        super(mark, model, year, type, color, prise);
        this.wheels = wheels;
    }

    public CamelsCar() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CamelsCar camelsCar = (CamelsCar) o;

        return wheels != null ? wheels.equals(camelsCar.wheels) : camelsCar.wheels == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (wheels != null ? wheels.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CamelsCar:" +
                " марка='" + mark + '\'' +
                ", модель='" + model + '\'' +
                ", год=" + year +
                ", тип='" + type + '\'' +
                ", цвет='" + color + '\'' +
                ", цена=" + prise +
                ", количество колёс=" + wheels;
    }
}
