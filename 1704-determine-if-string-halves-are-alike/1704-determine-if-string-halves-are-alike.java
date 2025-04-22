class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int i = 0;
        int j = n / 2;
        int count = 0;
        int count2 = 0;

        while (i < n / 2 && j < n) {
            char a = s.charAt(i);
            char b = s.charAt(j);

            if (Vowels(a))
                count++;
            if (Vowels(b))
                count2++;
            i++; j++;
        }

        if (count == count2) {
            return true;
        }

        return false;
    }

    public static Boolean Vowels(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
}