package com.homework8.task3;

public class Film {
    private String genre;
    private Integer price;

    public Film(String genre, Integer price) {
        this.genre = genre;
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getPrice() {
        return price;
    }
}
