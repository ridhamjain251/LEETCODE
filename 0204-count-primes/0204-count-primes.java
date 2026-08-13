class Solution {
    public int countPrimes(int n) {
        boolean[] noprime =new boolean[n];
        int count =0;
        for(int i=2;i<n;i++){
            if(noprime[i]==false){
                count++;
                for( int j=2;i*j<n; j++){
                    noprime[i*j]=true;
                }
            }
        }
        return count;
        
    }
}