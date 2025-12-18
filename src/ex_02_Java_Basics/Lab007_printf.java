package ex_02_Java_Basics;

public class Lab007_printf {
    public static void main(String[] args) {
        int num = 9;
        int i=1;

        System.out.printf("%d * %d = %d\n",num,i,(num*i++));
        System.out.printf("%d * %d = %d\n",num,i,(num*i++));
        System.out.printf("%d * %d = %d\n",num,i,(num*i++));
        System.out.printf("%d * %d = %d\n",num,i,(num*i++));
        System.out.printf("%d * %d = %d\n",num,i,(num*i++));
        System.out.printf("%d * %d = %d\n",num,i,(num*i++));
        System.out.printf("%d * %d = %d\n",num,i,(num*i++));
        System.out.printf("%d * %d = %d\n",num,i,(num*i++));
        System.out.printf("%d * %d = %d%n",num,i,(num*i++));
        System.out.printf("%d * %d = %d%n",num,i,(num*i++));
    }
}
