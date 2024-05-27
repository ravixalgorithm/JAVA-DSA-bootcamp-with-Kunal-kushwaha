import java.util.Scanner;

public class CategorizeDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n){
            case 1,2,3,4,5 -> System.out.println("weekdays");
            case 6,7 -> System.out.println("WeekEnds");
        }
    }
}
