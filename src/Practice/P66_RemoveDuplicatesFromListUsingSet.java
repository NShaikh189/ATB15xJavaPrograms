package Practice;

import java.util.*;

public class P66_RemoveDuplicatesFromListUsingSet {

    public static void main(String[] args) {

            List<Integer> integerList = new ArrayList<>(Arrays.asList(2,6,4,7,6,3,4,5,6,7));
            List<Integer> uniqueList = new ArrayList<>(new HashSet<>(integerList));

        System.out.println(uniqueList);
    }
}
