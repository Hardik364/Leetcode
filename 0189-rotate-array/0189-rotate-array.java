class Solution {
    public void Reverse(int[] nums, int i, int j)
    {
        while(i<j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        // APPROACH 1
        Reverse(nums,0,n-k-1);
        Reverse(nums,n-k,n-1);
        Reverse(nums,0,n-1);
        // APPROACH 2
        // int[] arr = new int[n];

        // for(int i = 0; i < k; i++)
        // {
        //     arr[i] = nums[n-k+i];
        // }

        // for(int i = k; i<n; i++)
        // {
        //     arr[i] = nums[i-k];
        // }

        // for(int i = 0; i<n; i++)
        // {
        //     nums[i] = arr[i];
        // }

    }
}