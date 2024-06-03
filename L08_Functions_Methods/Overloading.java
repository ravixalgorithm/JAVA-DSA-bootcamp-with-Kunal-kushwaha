public class Overloading {

    //Overloading by Varying datatype
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }

    //Overloading by varying no. of variable
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
//        fun(47);
//        fun("Ravi");

//        int ans = sum(2,3);
        int ans = sum(3,5,67);
        System.out.println(ans);
    }
}
