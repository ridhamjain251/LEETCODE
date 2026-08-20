class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int a1[]=new int[n];
        int a2[]=new int[n];
        int ans[]=new int[n];
        int k=0;
        int l=0;
        int r=0;
        a1[l++]=nums[0];
        a2[r++]=nums[1];
        for(int i=2; i<n;i++){
            if(a1[l-1]>a2[r-1]){
                a1[l++]=nums[i];
            }
            else
            a2[r++]=nums[i];
        }
        for(int i=0;i<l;i++){
            ans[k++]=a1[i];
        }
        for(int i=0;i<r;i++){
            ans[k++]=a2[i];
        }
        return ans;


        
    }
}