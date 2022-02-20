package lessons.lesson2.home_work.pc_laptop;

public class Ultrabook extends Laptop{
    Long price;
    String description;

    public Ultrabook() {
    }

    public Ultrabook(Boolean pc, Boolean laptop, Long weight, Long price, String description) {
        super(pc, laptop, weight);
        this.price = price;
        this.description = description;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "laptop=" + laptop +
                ", weight=" + weight +
                ", pc=" + pc +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
