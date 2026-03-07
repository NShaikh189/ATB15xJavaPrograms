package Practice;

import java.util.Arrays;

public class P72_StringArrayReversal {

    public static void main() {
        String sarr[] = {"Nayum","is","in","the","interview","today","Deloitte"};
        System.out.println(Arrays.toString(sarr));
        //output = [Nayum, the, in, is, interview]
        //left = 1; right = sarr.length-2 and ignore the if statement
        int left = 0;
        int right = sarr.length-1;
        String temp;
        while (left<right)
        {
            if(left%2!=0 && right%2!=0) {
                temp = sarr[left];
                sarr[left] = sarr[right];
                sarr[right] = temp;
            }
            left++;
            right--;
        }

        System.out.println(Arrays.toString(sarr));
    }
}
