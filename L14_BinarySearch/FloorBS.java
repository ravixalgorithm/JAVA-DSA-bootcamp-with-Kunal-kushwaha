public class FloorBS {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 144;
        int ans = floorBS(arr, target);
        System.out.println(ans);
    }

    // return index
    static int floorBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        if(target<arr[0]){
            return  -1;
        }
        if(target>arr[arr.length-1]){
            return arr.length-1;
        }

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]>target){
                end = mid - 1;
            }
            if(arr[mid]<target){
                start = mid + 1;
            }

        }
        return end;
    }
}
