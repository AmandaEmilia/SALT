package se.salt.chapter12;

import java.util.HashSet;
import java.util.Set;

public class Collections {

    public static void main(String[] args) {

        howToUseSet();

    }

    private static void howToUseSet() {
        Set car = new HashSet();
        car.add("Volvo");
        car.add("BMW");
        car.add("SEAT");
        car.add("Saab");
        car.add("Mini");
        car.add("Volvo");

        System.out.println(car.size()); // 5 bc all elements should be unique
        System.out.println(car);

        var i = car.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
