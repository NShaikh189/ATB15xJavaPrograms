package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Convert Array to List and vice versa
public class P64_ConvertArrayToList {

    public static void main(String[] args) {

        String[] a = {"a","b","c","abd"};

       List<String> aList = Arrays.asList(a);
        System.out.println(aList);

        String s[] = aList.toArray(new String[aList.size()]); //new String[0] defaulted to 0 will check the size of the String and if it is greater it will auto assign
        System.out.println(Arrays.toString(s));
    }
}
