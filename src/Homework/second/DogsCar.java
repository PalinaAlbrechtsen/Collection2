package Homework.second;

public class DogsCar extends Car {

    private String materialOfCarBody;

    public DogsCar(String mark, String model, Integer year, String type, String color, Integer prise, String materialOfCarBody) {
        super(mark, model, year, type, color, prise);
        this.materialOfCarBody = materialOfCarBody;
    }

    public DogsCar() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DogsCar dogsCar = (DogsCar) o;

        return materialOfCarBody != null ? materialOfCarBody.equals(dogsCar.materialOfCarBody) : dogsCar.materialOfCarBody == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (materialOfCarBody != null ? materialOfCarBody.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DogsCar:" +
                " марка='" + mark + '\'' +
                ", модель='" + model + '\'' +
                ", год=" + year +
                ", тип='" + type + '\'' +
                ", цвет='" + color + '\'' +
                ", цена=" + prise +
                ", материал кузова='" + materialOfCarBody + '\'';
    }
}
