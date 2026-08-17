class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int fre1[]= new int[256];
        for(int i=0; i<stones.length();i++){
            char ch= stones.charAt(i);
            fre1[ch]+=1;
            
        }
        int count=0;
        for(int i=0; i<jewels.length();i++){
            char ch= jewels.charAt(i);
            count+=fre1[ch];
        }
        return count;

        
    }
}