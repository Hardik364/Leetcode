class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> newArray = new ArrayList<>();
        int[] targetArray = new int[nums.length];

        for(int i = 0; i<nums.length; i++)
        {
            newArray.add(index[i],nums[i]);
        }

        for(int i = 0; i<nums.length; i++)
        {
            targetArray[i] = newArray.get(i);
        }
        return targetArray;
    }
}