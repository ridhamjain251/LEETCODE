class Solution {
    public int minRange(int a, int b, int c) {
        
        int [] ar = {a,b,c} ;

        Arrays.sort(ar) ;

        int p = ar[0] ;
        int q = ar[1] ;
        int r = ar[2] ;

        return Math.min(r-p,q) ;
        
    }
}