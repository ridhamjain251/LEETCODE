class Solution {
    public int countConsistent(int[] nums) {
         int ans = 0 ;
        int n = nums.length ;

        for(int i = 0 ; i < n ; i++){

            int a = nums[i] ;
            int min = nums[i] ;

            for(int j = i ; j < n ; j++){
                a &= nums[j] ;
                min  = Math.min(min , nums[j]) ;


                if(a == min) ans++ ;
                
            }
        }

            return ans  ;
        
    }
}