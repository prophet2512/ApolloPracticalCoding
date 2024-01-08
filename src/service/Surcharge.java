package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Surcharge {
    double timeFactor;
    double  demandFactor = 1.5;

    //Random random;

    private Map<Integer, Double> timeFactorMultipliers;
    private int[] timeBuckets = {6, 11, 17, 21, 23};

    public Surcharge() {
    }

    public  double calculateSurcharge(int time, double demand) {
        timeFactorMultipliers = new HashMap<>();
        timeFactorMultipliers.put(6, 1.0);
        timeFactorMultipliers.put(11, 1.5);
        timeFactorMultipliers.put(17, 1.2);
        timeFactorMultipliers.put(21, 1.7);
        timeFactorMultipliers.put(23, 1.1);
        for(int timeBucket: timeBuckets) {
            if(time<=timeBucket){
                this.timeFactor = timeFactorMultipliers.get(timeBucket);
                break;
            }
        }
        return timeFactor+demandFactor;
    }
}
