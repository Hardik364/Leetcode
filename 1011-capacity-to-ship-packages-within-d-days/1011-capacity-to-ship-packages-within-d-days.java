class Solution {
    public Boolean isPossible(int mid, int[] arr, int days)
    {
        Boolean flag = true;
        int sum = 0;
        int d = 1;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] > mid)
            {
                return false;
            }
            if(sum + arr[i] <= mid)
            {
                sum = sum + arr[i];
            }
            else 
            {
                d++;
                sum = arr[i];
                if(d>days)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public int shipWithinDays(int[] arr, int days) {
        int heavy = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<arr.length; i++)
        {
            heavy = Math.max(heavy,arr[i]);
            sum = sum + arr[i];
        }
        int high = sum;
        int ans = 0;
        int low = Math.max(heavy, sum/days);
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if(isPossible(mid,arr,days))
            {
                ans = mid;
                high = mid - 1; 
            }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
    }
}