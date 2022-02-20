package lessons.lesson2.home_work.pc_laptop;

public class Laptop extends Pc{
    Boolean laptop;
    Long weight;

    public Laptop() {
    }

    public Laptop(Boolean pc, Boolean laptop, Long weight) {
        super(pc);
        this.laptop = laptop;
        this.weight = weight;
    }

    public Boolean getLaptop() {
        return laptop;
    }

    public void setLaptop(Boolean laptop) {
        this.laptop = laptop;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptop=" + laptop +
                ", weight=" + weight +
                ", pc=" + pc +
                '}';
    }
}
