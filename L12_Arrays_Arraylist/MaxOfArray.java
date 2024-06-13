public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = { 1212, 1341, 31, 2, 423, 144, 43};
//        System.out.println(max(arr));
        System.out.println(maxInRange(arr, 2, 5));
    }

    static int max(int[] arr){
        int max = arr[0];
        int i = 0;
        while(i<arr.length){
            if(max<arr[i]){
                max = arr[i];
            }
            i++;
        }
        return max;
    }

    static int maxInRange(int[]  arr, int start, int end){
        int max =  arr[start];
        while(start<=end){
            if(max<arr[start]){
                max = arr[start];
            }
            start++;
        }
        return max;
    }

}
