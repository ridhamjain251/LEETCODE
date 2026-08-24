class Solution {
    public char findTheDifference(String s, String t){
        int f1[]=new int[26];
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            f1[ch-'a']--;
        }

    
   
        for(int i=0; i<t.length();i++){
            char ch=t.charAt(i);
            f1[ch-'a']++;
        }
        for(int i=0; i<26; i++){
            if(f1[i]!=0){
                return(char)(i+'a');
            }
        }
        return ' ';

}
        
    }
