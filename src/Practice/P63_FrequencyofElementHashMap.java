package Practice;

import java.util.*;

public class P63_FrequencyofElementHashMap {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3};
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i: arr)
        {
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
        }

        hashMap.forEach((k,v)->System.out.println(k+"=>"+v));

        System.out.println(hashMap);



    }
}
