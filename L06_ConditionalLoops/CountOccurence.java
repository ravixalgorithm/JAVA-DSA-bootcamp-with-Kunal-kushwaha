
import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        long n = in.nextLong();
        System.out.print("Enter the digit to find: ");
        int d  = in.nextInt();

        int count = 0;
        while (n > 0) {
            long sc = n % 10;
            if (sc == d) {
                count = count + 1;
            }
            n = n / 10;
        }
        System.out.println(d + " Occurs \"" + count + "\" Times");


    }

}
