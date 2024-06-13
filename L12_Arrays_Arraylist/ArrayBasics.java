public class ArrayBasics {
    public static void main(String[] args) {
        // Q. stores a roll number
        int a = 19;

        // Q. store a person's namme
        String name = "Kunal Kushwaha";

        // Q. store 5 roll numbers
        int rno1 = 21;
        int rno2 = 42;
        int rno3 = 47;
        // and more.....

        // syntax
        // datatype[] variable_name = new datatype[size];

        // store 5 roll numbers:
        int[] rnos = new int[5];
        // or directly
        int[] rnos2 = {21,42,47,30,73};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialization: actually here object is being created in the memory (heap)
        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

        // enhanced for loop
//        for (String element : arr){
//            System.out.println(element);
//        }

    }
}
