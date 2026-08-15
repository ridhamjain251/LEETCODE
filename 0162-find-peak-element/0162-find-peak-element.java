class Solution {
    public int findPeakElement(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int ans =-1;
        while(left<right){
            int mid= left+(right-left)/2;
            if( nums[mid]>nums[mid+1]) {
                ans=mid;
                right=mid;
            }
            else
            left=mid+1;
        }
        return left;
    }
} 