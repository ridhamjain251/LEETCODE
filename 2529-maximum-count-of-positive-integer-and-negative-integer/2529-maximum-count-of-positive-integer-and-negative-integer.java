class Solution {
    public int maximumCount(int[] nums) {
        int ecount=0;
        int ocount=0;
        for(int i: nums){
            if(i>0) ecount++;
            else if (i<0)
            ocount++;
            
        }
        return Math.max(ocount,ecount);
    }
}