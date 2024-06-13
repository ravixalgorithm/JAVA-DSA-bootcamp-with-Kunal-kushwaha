import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = in.nextInt();
        int rn = 0;
        while(n>0){
            int sc = n%10;
            rn = rn*10 + sc;
            n= n/10;
        }
        System.out.println("Rverse of the given number is " + rn);


    }
}
