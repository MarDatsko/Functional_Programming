package com.homework8.task1;

import java.time.LocalDate;

@FunctionalInterface
public interface CalculateDaysToNewYear {
    Integer getDaysToNewYear(LocalDate firstDate, LocalDate secondDate);
}
