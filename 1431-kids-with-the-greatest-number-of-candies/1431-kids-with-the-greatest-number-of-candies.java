class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highest = 0;
        List<Boolean> newArr = new ArrayList<>();
        for(int i = 0; i<candies.length; i++)
        {
            if(candies[i] > highest)
            {
                highest = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= highest) {
                newArr.add(true); 
            } else {
                newArr.add(false);
            }
        }
        return newArr;
    }
}