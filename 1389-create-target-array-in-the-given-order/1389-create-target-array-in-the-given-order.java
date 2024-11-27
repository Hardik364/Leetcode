class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        int[] target = new int[nums.length];
        ArrayList<Integer> newList = new ArrayList<>();

        for(int i =0; i<nums.length;i++)
        {
            newList.add(index[i],nums[i]);
        }

        for(int i=0;i<nums.length;i++)
        {
            target[i] = newList.get(i);
        }

        return target;
    }
}