package lessons.lesson2.class_work;

import java.util.Objects;

public class Tube implements Instrument{
    public String name = "Tube";
    int diameter;

    public Tube(int diameter) {
        this.diameter = diameter;
    }

    public Tube() {
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tube tube = (Tube) o;
        return diameter == tube.diameter;
    }

    @Override
    public String toString() {
        return "Tube{" +
                "diameter=" + diameter +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter);
    }

    @Override
    public void play() {
        System.out.println("Plays " + this.name + " with " + this.diameter + " diameter");
    }
}
