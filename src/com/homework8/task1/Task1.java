package com.homework8.task1;

import java.time.LocalDate;
import java.time.Period;

public class Task1 {
    public static final LocalDate NEW_YEAR = LocalDate.of(2020, 1, 1);

    public void calculateDays() {
        CalculateDaysToNewYear daysToNewYear = (firstDate, secondDate) -> {
            Period period = Period.between(firstDate, secondDate);
            return period.getDays();
        };
        Integer days = daysToNewYear.getDaysToNewYear(LocalDate.now(), NEW_YEAR);
        System.out.println("Days to New Year - " + days);
    }
}
