package ex_05_TernaryOperators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab010_ternaryOperator
{
    public static void checkGoaEligibility(int m_age)
    {
        int age = m_age;

        String e_msg = (age >=  18) ? "Eligible to travel alone" : "Not eligible to travel alone";
        System.out.println(e_msg);

    }

    public static void checkDrinkEligibility(int m_age)
    {
        int age = m_age;

        String e_msg = (age>=18) ? (age>25 ? "Eligible to travel and drink alcohol" : "Eligible to travel but not eligible to drink alcohol"): "Not eligible to travel and drink";
        System.out.println( e_msg);
    }
    public static void main() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int obj1 = Integer.parseInt(br.readLine());
       //  int obj1 = 25;
          checkGoaEligibility( obj1);
          checkDrinkEligibility(obj1);

    }
}
