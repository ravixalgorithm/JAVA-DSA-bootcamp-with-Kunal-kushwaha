import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array of primitive
        int[] arr = new int[5];
        arr[0] = 21;
        arr[1] = 30;
        arr[2] = 42;
        arr[3] = 47;
        arr[4] = 73;
        // [21, 30, 42, 47, 73]
        System.out.println(arr[3]);

        //input using for loop
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }

        // Output:-
        //method 1
//        System.out.println(Arrays.toString(arr));

        //method 2
//        for (int i = 0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        //method 3
//        for(int num : arr){
//            System.out.print(num + " ");
//        }

//        System.out.println(arr[5]); // index out of bound ERROR

        // Array of Objects
        String[] str = new String[
                4];
        for (int i=0; i<str.length; i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "Algo";

        System.out.println(Arrays.toString(str));
    }
}
