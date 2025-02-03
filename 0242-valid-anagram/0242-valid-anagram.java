class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] s1 = s.toLowerCase().toCharArray();
        char[] t1 = t.toLowerCase().toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);

        if(s.length() != t.length())
        {
            return false;
        }

        if(Arrays.equals(s1,t1))
        {
            return true;
        }
        return false;
    }
}