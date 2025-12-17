package Practice;

import java.util.ArrayList;

public class P02_Separate_Chars_Integers {

    public static void main(String[] args) {
        Object arr[] = {'a',3,5,'b',4,'e'};
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<Character> characterArrayList = new ArrayList<>();
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] instanceof Integer)
            {
                intList.add((Integer)arr[i]);
            }
            else if(arr[i] instanceof Character)
                characterArrayList.add((Character) arr[i]);
        }

        System.out.println(intList);
        System.out.println(characterArrayList);
    }
}
