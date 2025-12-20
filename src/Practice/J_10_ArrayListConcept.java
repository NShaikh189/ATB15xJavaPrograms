package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*Array -- Collection of similar data types, static array
*ArrayList -- CLASS, dynamic Array, create object of the ArrayList using new Keyboard
* can store empty and null values
* Maintains order
* Default Virtual Capacity - 10, pyhsical capacity - memory space consumed
* Dynamic allocation - Increase capacity by VC/2
* remove(index) - Remove the value and shrink the capacity
* e.g. [Hi, Hello, World, Login]
* a.remove(2); // remove World
* sout(a_; //[Hi, Hello, Login]
*/
public class J_10_ArrayListConcept {
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
        empNamesList.add("Dhoni");
        empNamesList.add("Rohit");
        empNamesList.add("");
        empNamesList.add(null);
        System.out.println(empNamesList.size());
        System.out.println(empNamesList);

        //over empNamesList.add(6,"Ronaldo");//IndexOutOfBoundsException: Index: 6, Size: 3
        System.out.println(empNamesList);

        empNamesList.remove(2);
        System.out.println(empNamesList);
        int ix[]={3,4,2,5};
        List<Integer> ix_list = Arrays.stream(ix).boxed().toList();
        System.out.println(ix_list);
    }
}
