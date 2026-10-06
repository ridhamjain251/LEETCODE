class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l=0;
        int r=0;
        int k=s1.length();
        int p_table[]=new int[26];
        int w_table[]=new int[26];
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            p_table[ch-'a']++;
        }
        while(r<s2.length()){
            char ch_r=s2.charAt(r);
            w_table[ch_r-'a']++;
            if(Arrays.equals(p_table,w_table)){
                    return true;
                }




            if(r-l+1==k){
                
              char ch_l=s2.charAt(l);
              w_table[ch_l-'a']--;


                l++;
            }
            r++;
        }
        return false;
    }
}