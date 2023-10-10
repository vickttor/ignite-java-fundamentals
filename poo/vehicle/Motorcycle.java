package fundamentals.poo.vehicle;

public class Motorcycle implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Motorcycle accelerating");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopping");
    }
}
