import model.Ride;
import service.Pricing;

public class Main {

    private static Pricing pricing = new Pricing();
    public static void main(String[] args) {

        int distance = 3;
        int time = 23;
        double demand = 10.5;

        Ride ride = new Ride.builder(distance, time, demand).build();

        ride = pricing.priceCalculator(ride);

        System.out.println(ride.toString());
    }
}