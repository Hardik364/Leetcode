class Solution {
    public int[] sortedSquares(int[] arr) {
    //    for(int i = 0; i<arr.length; i++)
    //    {
    //         arr[i] = arr[i]*arr[i];
    //    } 
    //     Arrays.sort(arr);
    //     return arr;
        int[] newarr = new int[arr.length];
        int low = 0;
        int high = arr.length - 1;
        int position = arr.length-1;
        while(low<=high)
        {
            int leftValue = arr[low];
            int RightValue = arr[high];

            if(Math.abs(leftValue) > Math.abs(RightValue))
            {
                newarr[position] = leftValue*leftValue;
                low++;
                position--;
            }
            else
            {
                newarr[position] = RightValue*RightValue;
                high--;
                position--;
            }
        }
        return newarr;
    }
}