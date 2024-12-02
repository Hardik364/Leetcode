class Solution {
    public int findNumbers(int[] nums) {
        
        int num = 0;
        for(int i = 0; i<nums.length; i++)
        {
            int count = 0;
            int a = nums[i];
            while(a != 0)
            {
                count++;
                int temp = a;
                int b = temp/10;
                a = b;
            }
            if(count%2==0)
            {
                num++;
            }
        }
        return num;
    }
}