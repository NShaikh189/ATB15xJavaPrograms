package ex_06_IncreementDecreementOperator;

public class Lab_010_Task_IncreementDecreementOperator {

    public static void main() {
        int a = 10;
        a = a++ + a++ + a++;
        // 10 (11) + 11 (12) + 12 (13)
        // 10 + 11 + 12
        // = 33
        //|| Line no  | a  |   Result (b) ||
        //|| 6 | a | 10
        //|| 7 | a++

                System.out.println(a);



    }
}
