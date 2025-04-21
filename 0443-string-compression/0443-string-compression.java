class Solution {
    public int compress(char[] chars) {
        int left = 0;
        int right = 0;
        StringBuilder res = new StringBuilder();
        int n = chars.length;
        while (right < n) {
            if (chars[left] != chars[right]) {
                int temp = right - left;
                if (temp > 1) {
                    res.append(chars[left]);
                    res.append(temp);
                } else {
                    res.append(chars[left]);
                }
                left = right;
                //    right++;

            } else {
                right++;
            }

        }
        int temp = right - left;
        if (temp > 1) {
            res.append(chars[left]);
            res.append(temp);
        } else {
            res.append(chars[left]);
        }

        for (int i = 0; i < res.length(); i++) {
            chars[i] = res.charAt(i);
        }
        return res.length();
    }
}