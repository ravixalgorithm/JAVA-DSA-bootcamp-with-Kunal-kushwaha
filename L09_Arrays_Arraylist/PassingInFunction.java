import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] nums = {3,25,42,52,34,53};
        System.out.println(Arrays.toString(nums));

        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
