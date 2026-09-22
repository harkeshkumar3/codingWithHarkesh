package org.example.Problems.MetroSmartCard;

import java.time.LocalDateTime;

public class FareCalculator {


    public double getFare(Stations source, Stations dis, LocalDateTime startTime) {
        FareStrategy fareStrategy = FareFactory.getFareInstance(startTime);

        int distance = source.getDistance(dis);
        double finalFare = distance * fareStrategy.getFareParStation();
        return finalFare;
    }
}
