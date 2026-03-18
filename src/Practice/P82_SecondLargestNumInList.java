package Practice;

public class P82_SecondLargestNumInList {

    public static void main() {
        int nums[] = {3,1,8,5,2,6,9,};

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int n: nums)
        {
            if(n>firstMax )
            {
                secondMax = firstMax;
                firstMax = n;

            }
            else if(n<firstMax && n>secondMax)
            {
                secondMax = n;
            }
        }
        System.out.println("First Max: "+firstMax);
        System.out.println("Second Max: "+secondMax);
    }
}
