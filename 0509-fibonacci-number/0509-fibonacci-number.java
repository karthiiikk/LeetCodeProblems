class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        if(n==2 || n==1)
        {
            int sum=a+b;
            return sum;
        }
        else if(n==0)
        {
            return 0;
        }
        int sum =sum(n-2,a,b);
        return sum;

  
    }
    public int sum(int n,int m1,int m2)
    {
        if(n<1)
        {
            return m1+m2;
        }
        return sum(n-1,m2,m1+m2);
    }
}