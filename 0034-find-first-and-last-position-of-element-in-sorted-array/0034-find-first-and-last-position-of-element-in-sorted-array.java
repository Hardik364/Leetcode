class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] ans = new int[2];

        // first position 
        int low = 0;
        int high = arr.length - 1;
        int fp = -1;

        while(low<=high)
        {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target)
            {
                fp = mid;
                high = mid - 1;
            }
            else if(arr[mid] > target)
            {
                high = mid - 1;
            }
            else 
            {
                low = mid + 1; 
            }
        }
        ans[0] = fp;
        
        // last position 
        low = 0; high = arr.length - 1;
        int lp = -1;

        while(low<=high)
        {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target)
            {
                lp = mid;
                low = mid + 1;
            }
            else if(arr[mid] > target)
            {
                high = mid - 1;
            }
            else 
            {
                low = mid + 1; 
            }
        }
        ans[1] = lp;
        
        return ans;

    }
}