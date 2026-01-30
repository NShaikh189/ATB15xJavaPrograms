package Practice;

public class P61_ZigZagConversion {

    public static String convert(String s, int numRows) {

        // Edge case
        if (numRows == 1 || s.length() <= numRows)
            return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currRow].append(c);

            // Change direction at top or bottom
            if (currRow == 0 || currRow == numRows - 1) {
                goingDown = !goingDown;
            }

            currRow += goingDown ? 1 : -1;
        }

        // Combine all rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
        // Output: PAHNAPLSIIGYIR
    }

    public String converts(String s, int numrows)
    {
        StringBuilder sb[] = new StringBuilder[numrows];

        for(int i=0; i<numrows;i++)
        sb[i] = new StringBuilder();

        if(s.length()<=numrows || numrows==1)
            return s;
        int currRow = 0;
        boolean goDown = false;

        if(currRow==0 || currRow<=numrows-1)
            goDown = true;
    }
}
