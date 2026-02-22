package Practice;

public class P69_TransposeMatrix {

    public static void main(String[] args) {
        int arr[][] = new int[3][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 4;
        arr[1][1] = 6;
        arr[2][0] = 7;
        arr[2][1] = 9;
        int matrix[][] = new int[arr[0].length][arr.length];
        System.out.println("Entered Matrix");
        for(int i=0; i< arr.length;i++)
        {
            for(int j=0; j< arr[i].length;j++) {
                System.out.print(arr[i][j] + " ");
                matrix[j][i] = arr[i][j];
            }
            System.out.println();
        }


        System.out.println("Transpose Matrix");
        for(int i=0; i< matrix.length;i++)
        {
            for(int j=0; j< matrix[i].length;j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }


    }
}
