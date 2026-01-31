package Practice;

public class P62_ReverseInteger32Bit {

    public static int reverse(int num) {
     //   return reverseX(x, 0);

        int temp =0;
        long reverse=0;

        while(num!=0)
        {
            temp = num%10;
            num = num/10;
            reverse = reverse*10 + temp;

            if(reverse>Integer.MAX_VALUE || reverse<Integer.MIN_VALUE)
            return 0;
        }

        return (int)reverse;
    }

//    private static int reverseX(int x, int result) {
//        if (x == 0)
//            return result;
//
//        int digit = x % 10;
//
//        // Overflow check BEFORE multiplication
//        if (result > Integer.MAX_VALUE / 10 ||
//                (result == Integer.MAX_VALUE / 10 && digit > 7))
//            return 0;
//
//        if (result < Integer.MIN_VALUE / 10 ||
//                (result == Integer.MIN_VALUE / 10 && digit < -8))
//            return 0;
//
//        return reverseX(x / 10, result * 10 + digit);
//    }
    public static void main(String[] args) {
        System.out.println("Max value "+Integer.MIN_VALUE);

        int result = reverse(1534236469);

        System.out.println(result);
        result = reverse(1);
        System.out.println(result);

        result = reverse(1534);
        System.out.println(result);

        result = reverse(-1534236461);
        System.out.println(result);
    }
}
//1534236469
//2147483647
//-2147483648

// -8 to 8
//-7 > -8
//-9 < -8