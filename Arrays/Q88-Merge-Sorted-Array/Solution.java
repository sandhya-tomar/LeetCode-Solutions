class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m + n]; 
        int i = 0, j = 0, k = 0;

        // Merge the two arrays
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1
        while (i < m) {
            nums3[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2
        while (j < n) {
            nums3[k++] = nums2[j++];
        }

        // Copy merged result back to nums1
        for (int x = 0; x < m + n; x++) {
            nums1[x] = nums3[x];
        }
    }
}
