package inheritance;

public class Angajat extends OmChinuit {

    private int salary;

    public Angajat(int salary, String firstName, String lastName) {
        this.salary = salary;
        this.age = 25;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void doAmazingStuff() {
        System.out.println("I'm an angajat, I have bani!");
    }

}
