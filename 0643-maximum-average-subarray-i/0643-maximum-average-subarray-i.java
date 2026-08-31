class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
       int n=nums.length-1;
       int sum=0;
       double ans=Integer.MIN_VALUE;

     for(int right=0; right<=n;right++){
        sum  += nums[right];
        if(right-left+1 ==k){
            ans=Math.max(ans,(double)sum/k);
            sum-=nums[left];
            left++;
        }
        


     }
     return ans;
        
     
    }
}