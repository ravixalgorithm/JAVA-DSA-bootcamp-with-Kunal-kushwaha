public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={-18, -2, 3, 4, 15, 16, 18, 22, 45};
        int target = 18;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

        int[] arr2={99,23,12,9,7,4,2,1,-1,-6,-10,-23};
        int target2 = 12;
        int ans2 = orderAgnosticBS(arr2, target2);
        System.out.println(ans2);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start]<arr[end];
//        if(arr[start]<arr[end]){
//            isAsc = true;
//        }
//        else{
//            isAsc = false;
//        }

        while(start<=end){
            // find the middle element
//                int mid = (start+end)/2;//might be possible that (start+end) exclude int limit
            int mid = start + (end-start)/2;
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }

    return -1;
    }
}
