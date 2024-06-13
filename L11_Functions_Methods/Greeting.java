import java.util.Scanner;

public class Greeting {

    static void greeting(){
        System.out.println("How are you?");
    }

    //returning a value
    static String greet(){
        String greeting = "How are you?";
        return greeting;
    }

    //pass the value of numbers when you are calling the method in main()
    static String myGreet(String name){
        String msg = "Hello "+name;
        return msg;
    }

    public static void main(String[] args) {
//        greeting();

//        String message = greet();
//        System.out.println(message);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        String msg = myGreet(name);
        System.out.println(msg);
    }
}
