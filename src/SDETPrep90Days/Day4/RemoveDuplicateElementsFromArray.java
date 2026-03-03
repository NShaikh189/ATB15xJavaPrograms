package SDETPrep90Days.Day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArray {

    public static void main() {

        int a[] = {20,10,10,30,10,40};
        Set<Integer> dataSet = new LinkedHashSet<>();

        for(int data: a)
        {
            dataSet.add(data);
        }
                                                    //x->x.intValue()
        int uniqueArr[] = dataSet.stream().mapToInt(Integer::intValue).toArray();
        for(int udata: uniqueArr)
            System.out.println(udata);
    }
}
