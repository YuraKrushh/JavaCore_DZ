package lessons.lesson2.class_work;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {

        Guitar guitar = new Guitar();
        guitar.strings = 4;
        Drum drum = new Drum();
        drum.size = 3;
        Tube tube = new Tube();
        tube.diameter = 5;


        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(guitar);
        instruments.add(drum);
        instruments.add(tube);

        for (Instrument inst: instruments
             ) {
            inst.play();

        }

    }
}
