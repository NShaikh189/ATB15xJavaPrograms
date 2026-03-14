package Practice;

import java.util.*;

public class P78_SDET_RemoveDuplicatesArray {

    public static void main() {
        int nums[] = {2,4,51,3,2,45,3};
        //[2,4,5,6,45]
//List<Integer> nlist = new ArrayList<>();
//for(int i : nums)
//    nlist.add(i);

Set<Integer> set = new LinkedHashSet<>();

for(int i: nums)
    set.add(i);

List<Integer> nlist = new ArrayList<>(set);
Collections.sort(nlist);
        System.out.println(set.toString());
        System.out.println(nlist);

    }
}
