package composition;

public class Car {
    private Engine engine = new Engine();
    private Wheels wheels = new Wheels();



    // A car can exist without fuel?
    private Fuel fuel;

    public Car(Fuel fuel) {
        this.fuel = fuel;
    }

}
