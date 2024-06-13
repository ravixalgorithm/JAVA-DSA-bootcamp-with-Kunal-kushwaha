public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        Boolean ans = searchRange(nums, target, 1, 5);
        System.out.println(ans);
    }

    static Boolean searchRange(int[] arr, int target, int start, int end) {
        if(arr.length==0){
            return false;
        }

        for(int i = start; i<=end; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
