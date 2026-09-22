package org.example.Problems.MetroSmartCard;

public interface FareStrategy {
    String getName();

    double getFareParStation();
}


class WeekendFare implements FareStrategy {

    @Override
    public String getName() {
        return WeekendFare.class.toGenericString();
    }

    @Override
    public double getFareParStation() {
        return 5.5;
    }
}

class WeekdayFare implements FareStrategy {

    @Override
    public String getName() {
        return WeekdayFare.class.toGenericString();
    }

    @Override
    public double getFareParStation() {
        return 7;
    }
}