package inheritance.downcast;

import inheritance.Angajat;
import inheritance.OmChinuit;
import inheritance.Prof;
import inheritance.Student;

import java.util.ArrayList;
import java.util.List;

public class TestUpcast {
    public static void main(String[] args) {
        OmChinuit first = new Student("Cristian", "Ghiu", 120, 10);
        OmChinuit second = new Angajat(100000, "Pantelimon", "Poepescu");
        OmChinuit third = new Prof();

        List<OmChinuit> list = List.of(first, second, third);

        for (OmChinuit om : list) {
            om.doAmazingStuff();
        }
    }
}
