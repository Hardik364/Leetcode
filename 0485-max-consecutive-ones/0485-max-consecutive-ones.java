class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int count = 0;
       int max_count = 0;
       for(int i = 0; i<nums.length; i++)
       {
            if(nums[i] == 1)
            {
                count = count + 1;
            }
            else if(nums[i] == 0)
            {
                count = 0;
            }
            max_count = Math.max(count,max_count);
       }
       return max_count;
    }
}