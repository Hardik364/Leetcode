class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        for(int row = 0; row<accounts.length; row++)
        {
            int temp = 0;
            
            for(int col = 0; col<accounts[row].length; col++)
            {
                temp = temp + accounts[row][col];
            }
            if(temp > richest)
            {
                richest = temp;
            }
        }
        return richest;
    }
}