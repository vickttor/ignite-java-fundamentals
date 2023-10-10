package fundamentals.poo.vehicle;

public class Car implements Vehicle {
    @Override
    public void stop() {
        System.out.println("Car stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("Car Accelerating");
    }
}
