package com.homework8.task4;

public class Protector {
    private Thing thing;

    public Protector(Thing thing) {
        this.thing = thing;
    }

    @Override
    public String toString() {
        return thing.toString();
    }
}
