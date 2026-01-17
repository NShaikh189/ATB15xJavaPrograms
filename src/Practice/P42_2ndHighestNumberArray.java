package Practice;

public class P42_2ndHighestNumberArray {
    public static void main(String[] args) {
        int a[] = {15, -15, 10, 20};//{3,44,2,31,34,67,25,47};

       int num =  findSecondHighest(a);
        System.out.println("Second Highesht number: "+num);
    }

    private static int findSecondHighest(int[] a) {
        int max = a[0]; //44
        int secondMax = a[0]; //3

        for(int i=1; i<a.length;i++)
        {
           // System.out.println(secondMax);
            if(a[i]>max)
            {
                secondMax = max;
                max = a[i];


            }
            else if(a[i]>secondMax && a[i]<max)
            {
                secondMax = a[i];
            }

        }

        System.out.println("Highest Number: "+max);
        return secondMax;

    }
}
