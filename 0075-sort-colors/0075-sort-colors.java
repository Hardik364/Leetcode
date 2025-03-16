class Solution {
    public static void Swap(int[] nums, int x, int y)
    {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public void sortColors(int[] nums) {
        // Method 1 - Using Dutch Flag Theorem
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid<=high)
        {
            if(nums[mid] == 0)
            {
                Swap(nums,mid,low);
                mid++;
                low++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                Swap(nums,mid,high);
                high--;
            }
        }
        // Method 2 - Using Counting the variables
        // int NoOfZeros = 0;
        // int NoOfOne = 0;
        // int NoOfTwo = 0;

        // for(int i = 0; i<nums.length; i++)
        // {
        //     if(nums[i] == 0) NoOfZeros++;
        //     if(nums[i] == 1) NoOfOne++;
        //     if(nums[i] == 2) NoOfTwo++;
        // }

        // for(int i = 0; i<nums.length; i++)
        // {
        //     if(i<NoOfZeros) nums[i] = 0;
        //     else if(i<NoOfZeros + NoOfOne) nums[i] = 1;
        //     else nums[i] = 2;
        // }
    }
}