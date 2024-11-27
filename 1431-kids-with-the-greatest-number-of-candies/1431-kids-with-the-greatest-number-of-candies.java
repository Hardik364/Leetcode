class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int temp = 0;
        ArrayList<Boolean> ans = new ArrayList<>();

        for(int i = 0; i<candies.length; i++)
        {
            if(temp < candies[i])
            {
                temp = candies[i];
            }
        }
        for(int i = 0; i<candies.length; i++)
        {
            if(candies[i] + extraCandies >= temp)
            {
                ans.add(true);
            }
            else
            {
                ans.add(false);
            }
        }
        return ans;
    }
}