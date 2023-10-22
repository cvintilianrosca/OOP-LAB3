package inheritance;

public class Prof extends OmChinuit {

    public Prof(String firstName, String lastName, Integer age) {
        super(firstName, lastName, age);
    }

    public Prof() {
        super();
    }

    @Override
    public void doAmazingStuff() {
        System.out.println("I'm a prof chinuit, but I have students!");
    }

    public void daNota() {
        System.out.println("Pot sa dau restanta si asta ma face fericit!");
    }

    public void daNota(int nota) {
        System.out.println("Ai luat 4.5, iti dau 5 sau restanta? ");
    }


}
