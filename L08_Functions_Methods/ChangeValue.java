import java.util.Arrays;

public class ChangeValue {

    static void change(int[] nums){
        nums[0] = 99; // if you make a change to the object via this variable, same obj will be changed - Parse by Value
    }

    public static void main(String[] args) {
        //create an Array
        int arr[]={1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
}
