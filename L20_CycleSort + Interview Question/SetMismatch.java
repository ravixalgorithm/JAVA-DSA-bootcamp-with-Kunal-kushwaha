public class SetMismatch {
    public int[] findErrorNums(int[] nums)
    {
        int i = 0;
        while (i < nums.length)
        {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct])
            {
                // Swap nums[i] and nums[correct]
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else
            {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++)
        {
            if (nums[index] != index + 1)
            {
                // nums[index] is the duplicate, index + 1 is missing
                return new int[] {nums[index], index + 1};
            }
        }
        return new int[] {-1, -1};
    }
}







