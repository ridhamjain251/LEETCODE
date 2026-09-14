class Solution {
    public int characterReplacement(String s, int k) {
       int arr[]=new int[26];
        int l=0;
        int max=0;
        int count=0;
        for(int r=0; r<s.length();r++){
            char ch_r=s.charAt(r);
            arr[ch_r-'A']++;
           count=Math.max(count,arr[ch_r-'A']);




            while(r-l+1 -(count)>k ){
                char ch_l=s.charAt(l);
                arr[ch_l-'A']--;

                l++;
            }
            max= Math.max(max,r-l+1);
        }
        return max;

        
    }
}