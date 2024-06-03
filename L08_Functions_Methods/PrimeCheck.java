import java.util.Scanner;

public class PrimeCheck {

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }

        //method 1
        return c*c>n;

        //method 2
//        if(c*c>n){
//            return true;
//        }
//        else{
//            return false;
//        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);

        System.out.println(ans);
    }
}
