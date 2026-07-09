class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int x1=x;
        while(x>0)
        {
            int temp=x%10;
            sum=(sum*10)+temp;
            x/=10;
        }
        return (x1==sum && x1>=0)?true:false;
    }
}