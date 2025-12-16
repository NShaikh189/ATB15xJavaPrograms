package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J_09_ArrayListConcept {
    public static void main(String[] args) {

        int arr1[] = {1, 3, 4, 3, 5, 23};

        List<Integer> arr1_list = new ArrayList<Integer>();
        for (int i : arr1)
            arr1_list.add(i);

        System.out.println(arr1_list);

        String s[] = {"Hello", "Program"};
        List<String> s_list = Arrays.asList(s);
        System.out.println(s_list);

        ArrayList<String> strList1 = new ArrayList<>();
        ArrayList<String> strlListSize = new ArrayList<>(20);
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("Hi", "Hello"));
        ArrayList<String> strList2 = new ArrayList<String>() {{
            add("Hello");
            add("World");
            add("Login");
            add("Register");

        }};

        for (String s_value : strList2) {
            System.out.println(s_value + " : " + strList2.indexOf(s_value));

        }
    }
}
