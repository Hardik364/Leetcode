class Solution {
    public void sortColors(int[] nums) {
        int NoOfZeros = 0;
        int NoOfOne = 0;
        int NoOfTwo = 0;

        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] == 0) NoOfZeros++;
            if(nums[i] == 1) NoOfOne++;
            if(nums[i] == 2) NoOfTwo++;
        }

        for(int i = 0; i<nums.length; i++)
        {
            if(i<NoOfZeros) nums[i] = 0;
            else if(i<NoOfZeros + NoOfOne) nums[i] = 1;
            else nums[i] = 2;
        }
    }
}