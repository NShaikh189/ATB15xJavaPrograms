package Practice;
/*
*
* *
* * *
* * * *
* * * * *
* ----------
* * * *
* * *
* *
*
* ------------
*      *
*    * *
*   * * *
* * * * *
 */
public class P38_RightTriangle {
    public static void main(String[] args) {
        int n =5;
        for(int i=1; i<n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println("=".repeat(10));
        for(int i=1; i<=n;i++)
        {
            for(int j=n;j>=i;j--)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println("=".repeat(10));

        /*
         *             *14
         *         *23 *24
         *     *32 *33 *34
         * *41 *42 *43 *44
         */
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>=1;j--)
                System.out.print(" ");

            for(int z=1;z<=i;z++)
            System.out.print("* ");

            System.out.println();
        }
    }
}
