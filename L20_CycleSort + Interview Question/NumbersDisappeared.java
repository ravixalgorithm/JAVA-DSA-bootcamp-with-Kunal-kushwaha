// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Google Question

import java.util.ArrayList;
import java.util.List;

public class NumbersDisappeared {
    public List<Integer> findDisappearedNumbers(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct])
            {
                swap(arr, i, correct);
            }
            else
            {
                i++;
            }

        }

        // Find numbers not appeared
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++)
        {
            if (arr[index] != index+1)
            {
                ans.add(index+1);
            }
        }
        return ans;
    }

    void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
