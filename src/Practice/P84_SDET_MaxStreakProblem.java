package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P84_SDET_MaxStreakProblem {
    public static void main() {

        List<String> weekLogs = new ArrayList<>(Arrays.asList("YYY","YYN","YYY","YYY","YYY","YNY"));

        int currentStreak=0;
        int maxStreak = 0;

        for(int i=0; i<weekLogs.size();i++)
        {
           if(!weekLogs.get(i).contains("N"))
           {
               currentStreak++;
               //maxStreak = Math.max(currentStreak, maxStreak);
                if(currentStreak>maxStreak)
                {
                    maxStreak = currentStreak;
                }
           }
           else {
               currentStreak=0;
           }
        }

        System.out.println(maxStreak);
    }
}
