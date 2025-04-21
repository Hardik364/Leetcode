class Solution {
    public int compress(char[] chars) {
        int left = 0;
        int right = 0;
        
        String s = "";

        int n = chars.length;

        while(right != n)
        {
            if(chars[left] != chars[right])
            {
                int temp = right - left;
                s = s + chars[left];
                if(temp > 1)
                {
                    s = s + temp;
                }
                left = right;
            }
            else 
            {
                right++;
            }
        }
        int last = right - left;
        s = s + chars[n-1];
        
        if(last > 1) s = s + last;

        for(int i = 0; i<s.length(); i++)
        {
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}