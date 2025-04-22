class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String joined1 = String.join("", word1);
        String joined2 = String.join("", word2);

        char[] arr1 = joined1.toCharArray();
        char[] arr2 = joined2.toCharArray();

        if(arr1.length != arr2.length) return false;
        if(!Arrays.equals(arr1,arr2)) return false;

        return true;
    }
}