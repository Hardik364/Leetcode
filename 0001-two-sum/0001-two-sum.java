class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int i = 0;
        int j = 0;

       while (i < nums.length) {
            if (j >= nums.length) {
                i++;
                j = i + 1;
                continue;
            }

            if (i < nums.length && j < nums.length && i != j && nums[i] + nums[j] == target)
            {
                arr[0] = i;
                arr[1] = j;
                break;
            } else {
                j++;
            }
        }
        return arr;
    }
}