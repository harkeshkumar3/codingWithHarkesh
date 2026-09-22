package org.example.Problems.MetroSmartCard;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class FareFactory {
    static final FareStrategy weekend = new WeekendFare();
    static final FareStrategy weekday = new WeekdayFare();

    public static FareStrategy getFareInstance(LocalDateTime localDateTime) {
        if (localDateTime.getDayOfWeek() == DayOfWeek.SATURDAY || localDateTime.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return new WeekendFare();
        } else {
            return new WeekdayFare();
        }
    }
}
