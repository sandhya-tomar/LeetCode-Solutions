class Solution {
    public int search(int[] nums, int target) {
        int p=-1;
        int first=0;
        int last=nums.length-1;
        int mid;
        while(first<=last){
            mid=first+(last-first)/2;
            if(nums[mid]==target){
                p=mid;
                break;
            }
            if(nums[mid]<target){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return p;
    }
}