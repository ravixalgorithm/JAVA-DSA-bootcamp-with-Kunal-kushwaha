import java.util.Scanner;

public class ArmstrongCheck {

    static Boolean isArmstrong(int n) {

        int orig = n;
        int sum = 0;
        while(n>=1){
            int a = n%10;
            n = n/10;
            sum = sum + (a*a*a);// valid onlu for 3 digit no.
        }

        //method 1
//        if(orig == sum){
//            return true;
//        }
//        else{
//            return false;
//        }

        //method 2
        return sum==orig;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        Boolean ans = isArmstrong(n);
        System.out.println(ans);

        // All armstrong no. b/w 100 and 1000
//        for(int i = 100;  i<1000; i++){
//            if(isArmstrong(i)){
//                System.out.println(i);
//            }
//        }
    }

}
