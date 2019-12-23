package com.homework8.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    private List<Film> oldFilm = new ArrayList<>();
    private List<Film> newFilm = new ArrayList<>();

    public Task3(){
        fillList();
    }

    public void fillList() {
        oldFilm.add(new Film("horror", 12));
        oldFilm.add(new Film("horror", 2));
        oldFilm.add(new Film("horror", 14));
        oldFilm.add(new Film("comedy", 6));
        oldFilm.add(new Film("comedy", 8));
        oldFilm.add(new Film("romance", 15));

        newFilm.add(new Film("horror", 45));
        newFilm.add(new Film("comedy", 35));
        newFilm.add(new Film("romance", 5));
        newFilm.add(new Film("romance", 25));
        newFilm.add(new Film("romance", 17));
        newFilm.add(new Film("romance", 24));
    }

    public void findAveragePriceByGenre() {
        List<Film> allFilm = Stream.concat(oldFilm.stream(),newFilm.stream()).collect(Collectors.toList());
        Map<String, List<Film>> gr = allFilm.stream()
                .collect(Collectors.groupingBy(Film::getGenre));
        gr.forEach((key,value)-> {
            System.out.print("\nFilms genre: " + key + " Average price= ");
            System.out.println(value.stream()
                    .mapToDouble(Film::getPrice)
                    .average()
                    .toString());
            System.out.println("Amount: " + value.size());
        });
    }
}
