package com.homework8.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    Box boxA = new Box();
    Box boxB = new Box();
    List<Box> boxesList = new ArrayList<>();

    public Task4() {
        fillBoxes();
    }

    private void fillBoxes() {
        boxA.addIntoBox(new Thing("phone", true));
        boxA.addIntoBox(new Thing("glass", true));
        boxA.addIntoBox(new Thing("sister", false));
        boxB.addIntoBox(new Thing("milk", true));
        boxB.addIntoBox(new Thing("dog", false));
        boxB.addIntoBox(new Thing("snake", false));
        boxesList.add(boxA);
        boxesList.add(boxB);
    }

    private void addExtraPacking() {
        List<Protector> protectorThings = boxesList.stream()
                .flatMap(box -> box.getBoxWithThings().stream())
                .filter(Thing::getFragile)
                .map(Protector::new)
                .collect(Collectors.toList());
        System.out.println("\nProtector things -" + protectorThings);
    }

    public void printResultExtraPacking() {
        addExtraPacking();
        printNotFragileThings();
    }

    private void printNotFragileThings() {
        List<Thing> simpleThings = boxesList.stream()
                .flatMap(box -> box.getBoxWithThings().stream())
                .filter(thing -> thing.getFragile().equals(false))
                .collect(Collectors.toList());
        System.out.println("Simple things -" + simpleThings);
    }
}
