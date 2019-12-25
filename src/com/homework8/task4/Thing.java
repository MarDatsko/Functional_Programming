package com.homework8.task4;

public class Thing {
    private String thingName;
    private Boolean isFragile;

    public Thing(String thingName, Boolean isFragile) {
        this.thingName = thingName;
        this.isFragile = isFragile;
    }

    public String getNameThing() {
        return thingName;
    }

    public Boolean getFragile() {
        return isFragile;
    }

    @Override
    public String toString() {
        return thingName.toString();
    }
}
