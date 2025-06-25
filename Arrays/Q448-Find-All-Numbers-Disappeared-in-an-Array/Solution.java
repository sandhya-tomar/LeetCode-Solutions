class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // -1 for 0-based indexing
            if (nums[index] > 0) {
                nums[index] = -nums[index]; // Mark as visited
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1); // +1 to convert to 1-based value
            }
        }

        return result;
    }
}