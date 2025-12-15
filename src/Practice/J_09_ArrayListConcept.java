package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J_09_ArrayListConcept {
    public static void main(String[] args) {

        int arr1[]={1,3,4,3,5,23};

        List<Integer> arr1_list = new ArrayList<Integer>();
        for(int i: arr1)
            arr1_list.add(i);

        System.out.println(arr1_list);

        String s[] = {"Hello","Program"};
        List<String> s_list = Arrays.asList(s);
        System.out.println(s_list);
    }
}
