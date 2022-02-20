package lessons.lesson2.home_work.printable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Stranger", 400, "R.Worst");
        Magazine magazine = new Magazine("Time", 20, true);

        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(book);
        printables.add(magazine);

        for (Printable one: printables
             ) {
            one.print();

        }
    }


}
