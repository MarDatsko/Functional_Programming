package com.homework8.task1;

import java.time.LocalDate;

@FunctionalInterface
public interface DaysToNewYear {
    Integer getDaysToNewYear(LocalDate firstDate, LocalDate secondDate);
}
