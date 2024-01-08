package service;

import model.Ride;

public class Pricing {

    private Surcharge surcharge = new Surcharge();

    public Ride priceCalculator(Ride ride) {
        int distance = ride.getDistance();
        int demand = ride.getDistance();
        return  new Ride.builder(ride.getDistance(), ride.getTime(), ride.getDemand())
                .price(priceCalculator(ride.getDistance(), ride.getDemand(), ride.getTime()))
                .build();
    }
    private double priceCalculator(int distance, double demand, int time) {
        double surcharge = calculateSurcharge(demand, time);
        if(distance<=3) {
            return 50*surcharge;
        }
        return (50 + (distance-3)*4)*surcharge;
    }

    private double calculateSurcharge(double demand, int time) {
        return surcharge.calculateSurcharge(time, demand);
    }

}
