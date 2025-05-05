class Solution {
    public int mySqrt(int x) {
        // double ans = Math.sqrt(x);
        // return (int)ans;
        long low = 0;
        long high = (long)x;

        while(low <= high)
        {
            long mid = low + (high - low) / 2;
            if(mid*mid == x) return (int)mid;
            else if(mid*mid > x) high = mid - 1;
            else low = mid + 1;
        }
        return (int)high;
    }
}