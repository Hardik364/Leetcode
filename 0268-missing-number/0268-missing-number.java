class Solution {
    public int missingNumber(int[] nums) {
        int totalSum = 0;
        int Sum = 0;
        for(int i = 1; i<=nums.length; i++)
        {
            totalSum = totalSum + i;
        }
        for(int i = 0; i<nums.length; i++)
        {
            Sum = Sum + nums[i];
        }
        return totalSum - Sum;
    }
}