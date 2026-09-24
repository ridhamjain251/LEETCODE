class Solution {
    public boolean checkIfPangram(String sentence) {
        int fre[]=new int[26];
        for(int i=0; i<sentence.length();i++){
            char ch=sentence.charAt(i);
            fre[ch-'a']++;
        }
        for(int i=0; i<fre.length;i++){
            if(fre[i]<1)
            return false;
        }
        return true;
        
    }
}