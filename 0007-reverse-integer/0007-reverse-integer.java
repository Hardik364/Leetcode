class Solution {
    public int reverse(int x) {
        int duplicate = x;
        int temp = 0;
        long a = 0;
        while(duplicate != 0)
        {
            temp = duplicate % 10;
            a = a*10 + temp;
            duplicate = duplicate / 10;
        }
        if(a>Integer.MAX_VALUE || a <Integer.MIN_VALUE)
        {
            return 0;
        }
        return (int)a;
    }
}