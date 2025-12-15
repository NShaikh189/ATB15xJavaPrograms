package Practice;

import java.util.Arrays;

public class J_08_ArraysConcept {
   public static void main() {
        //Array: non primitive data type
       //store similar data types

       int a[]={1,3,4,5,6};
       System.out.println(a[1]);

       int b[]=new int[4];
       b[1] = 1;
       b[0]=5;
      //  b[4]=6; //ArrayIndexOutOfBoundsException
       //b[-1]=8;//ArrayIndexOutOfBoundsException
       for(int i=0;i<4;i++)
       System.out.println(b[i]); //5,1,0,0
       System.out.println(b); //address of the array [I@27716f4
       System.out.println(Arrays.toString(b)); //[5,1,0,0]

       System.out.println(b.length);

       short sh[]=new short[3];
       System.out.println("Length: "+sh.length);
       System.out.println(Arrays.toString(sh));//[0,0,0]
       sh[0]=10;
       System.out.println(Arrays.toString(sh));
       sh[1]=4;
       System.out.println(Arrays.toString(sh));
       sh[2]=7;
       System.out.println(Arrays.toString(sh));

       for(int i=0;i<=sh.length-1;i++)
           System.out.println(sh[i]);


       char ch='x';
       int aa =(int)ch;
       Integer ax = Integer.valueOf(ch);
       int ay=Character.getNumericValue(ch);

       System.out.println("aa: "+aa);
       System.out.println("ax: "+ax.toString());
       System.out.println("ay: "+ay);

       //aa: 120
       //ax: 120
       //ay: 33
       //Java must either allocate by size OR initialize by values, not both.
       //declare by size
       int[] arr = new int[5];
        //declare by value
       int[] arr1 = {2,3,4};
       //using new with values
       int[] arr2 = new int[]{3,4,5};
       //declare then assign
       int[] arr3;
       arr3 = new int[]{3,2,1};


       //Not allowed size + value
       //int[] arr4 = new int[5]{2,5,3,2,5};
       //Object array : can store data of any data types (super class of array)
       Object empData[] = new Object[5];
      //  empData[0]="Nayum";
        empData[1]=36;
     //   empData[2]='M';
        empData[3]=9762341826L;
      //  empData[4]=true; Default value = null

       System.out.println(empData.length);
       System.out.println(Arrays.toString(empData));//[null, 36, null, 9762341826, null]

       for(Object i: empData)
       {
           System.out.println(i);
       }
       //Limitations:
       /*
       1. Similar type of data
       2. size is fixed: Static and NOT dynamic
       e.g. shopping site has 20 products in 2023,
       in 2024, product count is 100 during fest offer, increase size to 100
       in 2024, off season list only 50 products, using size of 100 but memory for 50 products size is waste
        */

       //Usecases for static Array
       /*
       Cinema theatres
       Flightbooking
       Shopping Category - static
       Products in Category - dynamic
       * */
   }




}
