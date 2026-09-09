class Solution {
    public boolean isPalindrome(String s) {
        String text = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] text1=text.toCharArray();
        check(0,text1.length-1,text1);
        if(text.equals(new String(text1)))
        {
            return true;
        }
        else
        {
            return false;
        }    
    }
    public void check(int l,int r,char[] arr)
    {
        if(l>=r)
        {
            return;
        }
        char temp=arr[r];
        arr[r]=arr[l];
        arr[l]=temp;
        check(++l,--r,arr);
    }
}