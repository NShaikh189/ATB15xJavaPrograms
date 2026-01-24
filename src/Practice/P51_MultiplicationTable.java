package Practice;

public class P51_MultiplicationTable {

    static void table(int num)
    {
        int i=1;
        mTable(num, i);
    }
    static void mTable(int num, int i)
    {
        if(i>10)
            return ;

        System.out.println(num*i);
        mTable(num, i+1);
    }
    public static void main(String[] args) {
        int num =5;

        table(num);
    }
}
