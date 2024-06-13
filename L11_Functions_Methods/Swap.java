public class Swap {
    // Parse by Reference
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void changeName(String naam){
        naam = "Ravi"; //creating a new object
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //swap number code
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a,b);

        System.out.println(a+" "+b);

        String name = "Algorithm";
        changeName(name);
        System.out.println(name);
    }
}
