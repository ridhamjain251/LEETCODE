class Solution {
    public boolean isAnagram(String s, String t) {
    
        int fre1[]=new int[256];
        int fre2[]=new int[256];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            fre1[ch]+=1;
        }
          for(int i=0;i<t.length();i++){
            char sh=t.charAt(i);
            fre2[sh]+=1;
        }
          for(int i=0;i<256;i++){
          if(fre1[i]!=fre2[i])
          return false;
        }
        return true;
        
    }
}