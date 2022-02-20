package lessons.lesson2.class_work;

import java.util.Objects;

public class Guitar implements Instrument {
    public String name = "Guitar";
    public int strings;

    public Guitar() {
    }

    public Guitar(int strings) {
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return strings == guitar.strings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strings);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "strings=" + strings +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Plays " + this.name + " with " + this.strings + " strings");
    }
}
