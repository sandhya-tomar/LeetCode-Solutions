class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int arrsum=0;
        int sum=(n*n +n)/2;
        for(int i=0;i<n;i++){
            arrsum=arrsum+nums[i];
        }
        return sum-arrsum;
    }
}