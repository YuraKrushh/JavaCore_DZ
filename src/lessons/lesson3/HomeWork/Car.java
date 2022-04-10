package lessons.lesson3.HomeWork;

import java.util.Objects;

public class Car {
    String model;
    Double year;
    Double power;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", power=" + power +
                '}';
    }

    public Car(String model, Double year, Double power) {
        this.model = model;
        this.year = year;
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(year, car.year) && Objects.equals(power, car.power);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, power);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getYear() {
        return year;
    }

    public void setYear(Double year) {
        this.year = year;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }
}
