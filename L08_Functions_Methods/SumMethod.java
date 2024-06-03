import java.util.Scanner;
public class SumMethod {

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = sc.nextInt();
        int sum = num1+ num2;
        System.out.println("Sum = " + sum);
    }

    // returning a value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       int sum = num1 + num2;;
       return sum;
    }

    //pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
//        sum();

//        int ans = sum2();
//        System.out.println("Sum = " + ans);

        int ans = sum3(34,45);
        System.out.println(ans);
    }

}
