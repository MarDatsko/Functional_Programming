package com.homework8.task4;

public class Thing {
    private String nameThing;
    private Boolean isFragile;

    public Thing(String nameThing, Boolean isFragile) {
        this.nameThing = nameThing;
        this.isFragile = isFragile;
    }

    public String getNameThing() {
        return nameThing;
    }

    public Boolean getFragile() {
        return isFragile;
    }

    @Override
    public String toString() {
        return nameThing.toString();
    }
}
