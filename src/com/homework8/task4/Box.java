package com.homework8.task4;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<Thing> boxWithThing = new ArrayList<>();

    public List<Thing> getBoxWithThing() {
        return boxWithThing;
    }

    public void addInBox(Thing thing) {
        boxWithThing.add(thing);
    }
}
