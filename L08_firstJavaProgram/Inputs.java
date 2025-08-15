import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some input :");
        int rollno = sc.nextInt();
        System.out.println(rollno);

        String name = sc.next();
        System.out.println(name);

        float marks = sc.nextFloat();
        System.out.println(marks);

        sc.close();
    }
}
