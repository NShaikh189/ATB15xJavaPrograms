package Practice;

import java.util.HashSet;

public class P53_DuplicateElementsArray {
    public static void main(String[] args) {
        int arr[] = {2,4,3,5,21,77,3,32,5,6,2,5};

        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int a: arr)
        {
            if(!hashSet.add(a))
            {
                duplicates.add(a);
            }

        }
        System.out.println(duplicates.toString());
    }
}
