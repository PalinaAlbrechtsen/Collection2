package Homework.second;

public class CatsCar extends Car {

    private Integer doors;

    public CatsCar(String mark, String model, Integer year, String type, String color, Integer prise, Integer doors) {
        super(mark, model, year, type, color, prise);
        this.doors = doors;
    }

    public CatsCar() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CatsCar catsCar = (CatsCar) o;

        return doors != null ? doors.equals(catsCar.doors) : catsCar.doors == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (doors != null ? doors.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CatsCar:" +
                " марка='" + mark + '\'' +
                ", модель='" + model + '\'' +
                ", год=" + year +
                ", тип='" + type + '\'' +
                ", цвет='" + color + '\'' +
                ", цена=" + prise +
                ", количество дверей=" + doors;
    }
}
