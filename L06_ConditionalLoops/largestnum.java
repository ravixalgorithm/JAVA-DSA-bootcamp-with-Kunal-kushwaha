
import java.util.Scanner;

public class largestnum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
         System.out.print("number 1: ");
         int num1 = in.nextInt();
         System.out.print("number 2: ");
         int num2 = in.nextInt();
         System.out.print("number 3: ");
         int num3 = in.nextInt();
         int largest = num3;

         if(num1> num2 && num1>num3){
            largest = num1;
         }
         if(num2>num3 && num2>num1){
            largest = num2;
         }
         
         System.out.println("largest number is " + largest);
    }
}
