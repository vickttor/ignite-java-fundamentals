package fundamentals.poo.vehicle;

public class Polimorfism {

    public static void main(String[] args) {

        Car uno = new Car();

        uno.accelerate();
        uno.stop();

        Motorcycle bmws100rr = new Motorcycle();

        bmws100rr.accelerate();
        bmws100rr.stop();
    }
}
