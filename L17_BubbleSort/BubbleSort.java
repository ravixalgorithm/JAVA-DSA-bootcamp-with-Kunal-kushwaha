import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args)
    {
        int[] arr = {2,4,3,5,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        // run the steps n-1 times
        boolean swapped;
        for (int i = 0; i < arr.length; i++)
        {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++)
            {
                // swap if the item is smaller than previous item
                if (arr[j] < arr[j-1])
                {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    swapped = true;
                }
            }

            // Already swapped
            if(!swapped)
            {
                return;
            }
        }
    }
}
