class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // Initializing a new 2D Array
        int[][] ans = new int[image.length][];
        
        for (int row = 0; row < image.length; row++) {
            // Initialize the current row in the new array
            ans[row] = new int[image[row].length];
            
            // Flip and invert the row
            for (int col = 0; col < image[row].length; col++) {
                // Flip the column index (reversing order) and invert the value
                ans[row][col] = image[row][image[row].length - 1 - col] ^ 1;
            }
        }
        
        return ans;
    }
}
