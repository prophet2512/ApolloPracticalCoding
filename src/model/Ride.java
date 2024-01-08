package model;

public class Ride {
    private int distance;
    private int time;
    private double demand;
    private double price;

    private Ride(builder builder) {
        this.demand = builder.demand;
        this.time = builder.time;
        this.distance = builder.distance;
        this.price = builder.price;
    }

    public static class builder {
        private final int distance;
        private final int time;
        private final double demand;

        private double price;
        public builder(int distance, int time, double demand) {
            this.distance = distance;
            this.time = time;
            this.demand = demand;
        }

        public builder price(double price) {
            this.price = price;
            return this;
        }

        public Ride build() {
            return new Ride(this);
        }
    }

    public int getDistance() {
        return distance;
    }

    public int getTime() {
        return time;
    }

    public double getDemand() {
        return demand;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "distance=" + distance +
                ", time=" + time +
                ", demand=" + demand +
                ", price=" + price +
                '}';
    }
}
