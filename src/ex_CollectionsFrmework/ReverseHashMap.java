package ex_CollectionsFrmework;

import java.util.HashMap;
import java.util.Map;

public class ReverseHashMap {

    public static void main() {


        HashMap<String,Integer> hmap = new HashMap<String, Integer>();
        HashMap<Integer,String> rmap = new HashMap<>();
        hmap.put("A",1);
        hmap.put("B",2);
        hmap.put("C",3);

        for(Map.Entry<String,Integer> entry : hmap.entrySet())
        {
            rmap.put(entry.getValue(), entry.getKey());
        }

        System.out.println(rmap);
    }
}
