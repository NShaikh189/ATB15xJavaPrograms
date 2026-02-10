package ex_CollectionsFrmework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AList_Class {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        List<String> rList = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");

        System.out.println(fruits);

        fruits.addFirst("Avacado");
        System.out.println(fruits);

        fruits.add(2, "Strawberry");
        System.out.println(fruits);

        fruits.addLast("WaterMelon");
        System.out.println(fruits);

        System.out.println(fruits.getFirst());
        System.out.println(fruits.getLast());

        System.out.println(fruits);
        rList = fruits.reversed();
        System.out.println(fruits.reversed());
        System.out.println(fruits);

        fruits.removeLast();
        System.out.println(fruits);

        System.out.println(rList);

        rList.removeFirst();
        System.out.println(rList);

        Collections.reverse(fruits);
        System.out.println(fruits);
    }
}
