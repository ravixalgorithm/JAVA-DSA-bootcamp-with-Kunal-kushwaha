import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
        */

//        int[][] arr = new int[3][];

//        int[][] arr = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, // 1st index
//                {6, 7, 8, 9}  // 2nd indexx -> arr[2] = {6, 7, 8, 9}
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows

        //input
        for (int row=0; row<arr.length; row++){
            // for each col in every row
            for (int col=0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        //output
        //method 1
        for (int row=0; row<arr.length; row++){
            // for each col in every row
            for (int col=0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        //method 2;
        for (int row=0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        //method 3
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
