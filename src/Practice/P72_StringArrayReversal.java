package Practice;

import java.util.Arrays;

public class P72_StringArrayReversal {

    public static void main() {
        String sarr[] = {"Nayum","is","in","the","interview"};
        //output = [Nayum, the, in, is, interview]
        int left = 1;
        int right = sarr.length-2;
        String temp;
        while (left<right)
        {
            temp = sarr[left];
            sarr[left] = sarr[right];
            sarr[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(sarr));
    }
}
