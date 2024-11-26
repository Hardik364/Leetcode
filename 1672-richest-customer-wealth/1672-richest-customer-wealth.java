class Solution {
    public int maximumWealth(int[][] accounts) {
        // varaible to store the richest Customer Wealth
        int richest = 0;

        // Loop for going through the Row
        for(int row = 0; row<accounts.length; row++)
        {
            // Variable to store every row sum once
            int temp = 0;
            
            // Going through the columns
            for(int col = 0; col<accounts[row].length; col++)
            {
                temp = temp + accounts[row][col];
            }
            // checking if the previous is greater or not 
            if(temp > richest)
            {
                richest = temp;
            }
        }
        return richest;
    }
}