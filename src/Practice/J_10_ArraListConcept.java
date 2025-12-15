package Practice;

import java.util.ArrayList;

/*
*Array -- Collection of similar data types, static array
*ArrayList -- CLASS, dynamic Array, create object of the ArrayList using new Keyboard
*/
public class J_10_ArraListConcept {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        System.out.println(ar.size());
        System.out.println(ar);

        ar.add(300);
        ar.add(400);
        System.out.println(ar.size());
        System.out.println(ar);

        ar.add(500);
        ar.add(600);
        System.out.println(ar.size());
        System.out.println(ar);

        ar.remove(5);
        System.out.println(ar.size());
        System.out.println(ar);

        ar.remove(0);
        System.out.println(ar.size());
        System.out.println(ar);

        //add duplicate
        ar.add(300);
        System.out.println(ar.size());
        System.out.println(ar);

        //able to add bcoz it is a raw type
        ar.add(12.33);
        ar.add(true);
        ar.add('c');
        System.out.println(ar); //[200, 300, 400, 500, 300, 12.33, true, c]

        //MarksList -->Generic : int -> Integer
        //ArrayList<Integer> marksList = new ArrayList<>(); OR
        ArrayList<Integer> marksList = new ArrayList<Integer>();
        marksList.add(100);
        marksList.add(1200);
        //marksList.add(true); Not allowed

        ArrayList<String> empNamesList = new ArrayList<>();
        empNamesList.add("AJ");
        empNamesList.add("Messi");
        empNamesList.add("Sachin");
        System.out.println(empNamesList.size());
        System.out.println(empNamesList);
    }
}
