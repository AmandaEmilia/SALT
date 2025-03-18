package se.salt.chapter12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections {

    public static void main(String[] args) {

        howToUseSet();
        howToUseList();

    }

    private static void howToUseList() {
        List<String> car = new ArrayList<>(); //diamond operator to tell what type stored in this list
        car.add("Volvo");
        car.add("BMW");
        car.add("SEAT");
        car.add("Saab");
        car.add("Mini");
        car.add("Volvo");

        System.out.println(car.size()); // 6 bc all elements counts even if they are duplicates.
        System.out.println(car.get(1)); //index 1 will be BMW
        System.out.println(car);

        for(String type: car){
            System.out.println(type);
        }
    }

    private static void howToUseSet() {
        Set<String> car = new HashSet();
        car.add("Volvo");
        car.add("BMW");
        car.add("SEAT");
        car.add("Saab");
        car.add("Mini");
        car.add("Volvo");

        System.out.println(car.size()); // 5 bc all elements should be unique
        System.out.println(car);

        var i = car.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
