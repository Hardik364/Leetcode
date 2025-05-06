class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // return nums[n/2];
        int[] ans = new int[1];
        int freq = 0;
        int i = 0;
        while(i != nums.length)
        {
            if(freq == 0)
            {
                ans[0] = nums[i];
            }

            if(ans[0] == nums[i])
            {
                freq++;
            }
            else freq--;
            i++
        }
        return ans[0];
    }
}