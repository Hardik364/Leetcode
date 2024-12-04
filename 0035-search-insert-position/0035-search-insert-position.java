class Solution {
    public int searchInsert(int[] nums, int target) {
        int count = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] == target)
            {
                count++;
                return i;
            }
        }

        if(count == 0)
        {
            for(int i = nums.length-1; i>=0; i--)
            {
                if(nums[i] < target)
                {
                    return i+1;
                }
            }
        }
        return 0;
    }
}