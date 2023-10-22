package inheritance;

import java.util.Objects;

public class Student extends OmChinuit {

    public Integer noptiNedormite;

    public Student(String firstName, String lastName, Integer age, Integer noptiNedormite) {
        super(firstName, lastName, age);
        this.noptiNedormite = noptiNedormite;
    }

    @Override
    public void doAmazingStuff() {
        System.out.println("I'm a chinuit student, I have homeworks to do!");
    }

    public void primesteNota() {
        System.out.println("Imi fac curaj si ma duc la examen, poate trec!");
    }

    // TODO: explain it live
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(noptiNedormite, student.noptiNedormite);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(noptiNedormite);
//    }
}
