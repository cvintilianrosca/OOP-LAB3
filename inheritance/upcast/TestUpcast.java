package inheritance.upcast;

import inheritance.Angajat;
import inheritance.OmChinuit;
import inheritance.Prof;
import inheritance.Student;

public class TestUpcast {
    public static void main(String[] args) {
        OmChinuit first = new Student("Cristian", "Ghiu", 120, 10);
        OmChinuit second = new Angajat(100000, "Pantelimon", "Poepescu");
        OmChinuit third = new Prof();

        first.doStuff();
        second.doStuff();
        third.doStuff();


        System.out.println();
        System.out.println();

        first.doAmazingStuff();
        second.doAmazingStuff();
        third.doAmazingStuff();

    }
}
