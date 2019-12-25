package com.homework8.task4;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<Thing> boxWithThings = new ArrayList<>();

    public List<Thing> getBoxWithThings() {
        return boxWithThings;
    }

    public void addIntoBox(Thing thing) {
        boxWithThings.add(thing);
    }
}
