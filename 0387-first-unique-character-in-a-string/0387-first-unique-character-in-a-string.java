class Solution {
    public int firstUniqChar(String s) {
        int fre[]=new int[256];
        for(int i=0; i<s.length();i++){
            char ch =s.charAt(i);
            fre[ch]+=1;
        }
        for(int i=0; i<s.length();i++){
            if(fre[s.charAt(i)]==1)
            return i;
            
        }
        return -1;
        
    }
}