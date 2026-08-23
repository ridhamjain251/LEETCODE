class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int ls=0;
        int rs=0;
        int l=0;
        int r=0;
        for(int i=0; i<n/2;i++){
            if(num.charAt(i)=='?')
            l++;
            else
            ls=ls+num.charAt(i)-'0';

        }
        for(int i=n/2; i<n;i++){
            if(num.charAt(i)=='?')
            r++;
            else
            rs=rs+num.charAt(i)-'0';

        }

        if((l+r) % 2==1)
        return true;
         
     return (ls-rs) != (r-l) *9 /2;

        
    }
}