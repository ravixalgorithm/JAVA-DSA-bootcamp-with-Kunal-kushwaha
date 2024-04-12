
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n= sc.nextInt();
        if(n<=1){
            System.out.println("Neither Prime Nor Composite");
            return;
        }
        int c = 2;
        while (c*c<=n){
            if(n%c==0){
                System.out.println("Not Prime");
                return;
            }
            c++;
        }
        if(c*c>n){
            System.out.println("Prime");
        }
    }
}
