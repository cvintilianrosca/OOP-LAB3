package inheritance;

public class OmChinuit {

    public String firstName;
    public String lastName;
    public Integer age;

    public OmChinuit(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public OmChinuit() {

    }

    public void doStuff() {
        System.out.println("This person is called " + firstName + " " + lastName + " " + age);
    }

    public void doAmazingStuff() {
        System.out.println("I'm just an om chinuit");
    }

}
