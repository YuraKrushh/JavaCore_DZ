package lessons.lesson2.home_work.pc_laptop;

public class Pc {
    Boolean pc;

    public Pc() {
    }

    public Pc(Boolean pc) {
        this.pc = pc;
    }

    public Boolean getPc() {
        return pc;
    }

    public void setPc(Boolean pc) {
        this.pc = pc;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "pc=" + pc +
                '}';
    }

    public static void main(String[] args) {


        Ultrabook ultrabook = new Ultrabook(true, true, 400L, 2000L, "LG");
        Workstation workstation = new Workstation(true, true, 600L, true, "Xiaomi" );

    }
}
