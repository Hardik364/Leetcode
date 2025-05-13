class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        int low = 0;
        int high = arr.length-1;
        while(low<=high)
        {
            if(arr[low] + arr[high] == target) 
            {
                ans[0] = low + 1;
                ans[1] = high + 1;
                break;
            }
            else if(arr[low] + arr[high] > target) high--;
            else low++;
        }
        return ans;
    }
}