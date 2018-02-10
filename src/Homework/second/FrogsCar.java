package Homework.second;

public class FrogsCar extends Car {

    private String picture;

    public FrogsCar(String mark, String model, Integer year, String type, String color, Integer prise, String picture) {
        super(mark, model, year, type, color, prise);
        this.picture = picture;
    }

    public FrogsCar() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        FrogsCar frogsCar = (FrogsCar) o;

        return picture != null ? picture.equals(frogsCar.picture) : frogsCar.picture == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (picture != null ? picture.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FrogsCar:" +
                " марка='" + mark + '\'' +
                ", модель='" + model + '\'' +
                ", год=" + year +
                ", тип='" + type + '\'' +
                ", цвет='" + color + '\'' +
                ", цена=" + prise +
                ", рисунок на кузове='" + picture + '\'';
    }
}
