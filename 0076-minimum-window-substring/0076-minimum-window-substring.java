class Solution {
    public String minWindow(String s, String t) {
    
        int l=0;
        int min=0;
        int count=0;
        int minl=Integer.MAX_VALUE;
        int fre[]=new int[256];
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            fre[ch]++;


        }
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            if(fre[ch]>0)
            count++;
            fre[ch]--;



            while(count==t.length()){
                if(r-l+1<minl){
                    minl=r-l+1;
                    min=l;
                }
                char lch=s.charAt(l);
                fre[lch]++;
                if(fre[lch]>0)
                count--;




                l++;
            }
            




        }
        if(minl==Integer.MAX_VALUE)
        return "";
        else
        return s.substring(min,min+minl);
    }
}