class Solution {
    public boolean isPalindrome(int n) {
        if(n<0)
        return false;
        int rem,rev=0;
        int temp=n;
        while(n!=0){
            rem=n%10;
            rev= rev*10+rem;
            n=n/10;
        }
        if(rev==temp)
        return true;
        else
        return false;
        
    }
}