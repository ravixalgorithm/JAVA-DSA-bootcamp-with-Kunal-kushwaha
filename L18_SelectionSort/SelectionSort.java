import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args)
    {
        int[] arr = {};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            //Find the max item in rem array & swap with correct index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int last)
    {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int last)
    {
        int max = start;
        for(int i = start; i <= last; i++)
        {
            if(arr[max] < arr[i])
            {
                max = i;
            }
        }
        return max;
    }
}
