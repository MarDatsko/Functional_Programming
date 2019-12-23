package com.homework8.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

    public void addExtraPacking (){
        Box boxA = new Box();
        boxA.addInBox(new Thing("phone",true));
        boxA.addInBox(new Thing("glass",true));
        boxA.addInBox(new Thing("sister",false));

        Box boxB = new Box();
        boxB.addInBox(new Thing("milk",true));
        boxB.addInBox(new Thing("dog",false));
        boxB.addInBox(new Thing("snake",false));

        List<Box> boxList = new ArrayList<>();
        boxList.add(boxA);
        boxList.add(boxB);

        List<Protector> protectorThings = boxList.stream()
                .flatMap(box -> box.getBoxWithThing().stream())
                .filter(Thing::getFragile)
                .map(Protector::new)
                .collect(Collectors.toList());

        System.out.println("\nProtector things -" + protectorThings);

        List<Thing> simpleThings = boxList.stream()
                .flatMap(box -> box.getBoxWithThing().stream())
                .filter(thing -> thing.getFragile().equals(false))
                .collect(Collectors.toList());

        System.out.println("Simple things -" + simpleThings);
    }
}
