package lessons.lesson2.home_work.pc_laptop;

public class Workstation extends Laptop{
    Boolean workstation;
    String description;

    public Workstation() {
    }

    public Workstation(Boolean pc, Boolean laptop, Long weight, Boolean workstation, String description) {
        super(pc, laptop, weight);
        this.workstation = workstation;
        this.description = description;
    }

    public Boolean getWorkstation() {
        return workstation;
    }

    public void setWorkstation(Boolean workstation) {
        this.workstation = workstation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "laptop=" + laptop +
                ", weight=" + weight +
                ", pc=" + pc +
                ", workstation=" + workstation +
                ", description='" + description + '\'' +
                '}';
    }
}
