class Solution {
    public boolean isPalindrome(int x) {
        int a = x;
        int temp = 0;
        int b = 0;

        while(a != 0)
        {
            temp = a % 10;
            b = b * 10 + temp;
            a =  a / 10;
        }
        if(x < 0)
        {
            return false;
        }
        if(b == x)
        {
            return true;
        }
        
        return false;
    }
}