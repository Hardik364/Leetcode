class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n]; // Temporary array to store sorted elements
        int i = 0, j = 0, k = 0;

        // Merge both arrays into temp[]
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[k] = nums1[i];
                i++;
            } else {
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from nums1 (if any)
        while (i < m) {
            temp[k] = nums1[i];
            i++;
            k++;
        }

        // Copy remaining elements from nums2 (if any)
        while (j < n) {
            temp[k] = nums2[j];
            j++;
            k++;
        }

        // Copy sorted elements back into nums1
        for (int x = 0; x < m + n; x++) {
            nums1[x] = temp[x];
        }
    }
}
