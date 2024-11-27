class Solution {
    public int[] shuffle(int[] nums, int n) {
        int count = 0;
        int[] ans = new int[nums.length];

        for(int i = 0; i<n; i++)
        {
            ans[count] = nums[i];
            ans[count+1] = nums[i+n];
            count = count + 2;
        }
        return ans;
    }
}