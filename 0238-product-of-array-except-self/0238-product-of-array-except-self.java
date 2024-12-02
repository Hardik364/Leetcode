class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // int[] newArr = new int[nums.length];

        // for(int i = 0; i<nums.length;i++)
        // {
        //     int result = 1;
        //     int result2 = 1;

        //     for(int j = i+1; j<nums.length; j++)
        //     {
        //         result = result*nums[j];
        //     }

        //     if(i > 0)
        //     {
                
        //         for(int k = i-1; k>= 0; k--)
        //         {
        //             result2 = result2 * nums[k];
        //         }
        //     }

        //     newArr[i] = result * result2;
        // }
        // return newArr;

        int n = nums.length;
        int[] forward = new int[n];
        int[] backward = new int[n];
        int[] newArr = new int[n];

        // Initialize forward[0] to 1
        forward[0] = 1;
        for (int i = 1; i < n; i++) {
            forward[i] = forward[i - 1] * nums[i - 1];
        }

        // Initialize backward[n - 1] to 1
        backward[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            backward[i] = backward[i + 1] * nums[i + 1];
        }

        // Calculate the result array
        for (int i = 0; i < n; i++) {
            newArr[i] = forward[i] * backward[i];
        }

        return newArr;
    }
}