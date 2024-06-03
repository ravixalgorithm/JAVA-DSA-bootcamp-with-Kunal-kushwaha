import java.util.Arrays;

public class VarArgs {

    static void multiple(int a, int b, String ...v){

    }

    static void fun(int ...n){
        System.out.println(Arrays.toString(n));
    }
    public static void main(String[] args) {
        fun(56,65,88,3,4,56,32,5,6,45,4555,34,3);

        multiple(2,3,"Kunal", "Ravi","Algo");// parameters should be in as assigned and ...n should always be used at the end
    }
}
