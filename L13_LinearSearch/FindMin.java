public class FindMin {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int ans = minimum(nums);
        System.out.println(ans);
    }

    // assume arr.length != 0
    static int minimum(int[] arr) {
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
