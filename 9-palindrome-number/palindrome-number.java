class Solution {
    public boolean isPalindrome(int x) {
        
        int iDigit = 0;
        int rev = 0;
        int original = x;

        if(x < 0)
        {
            return false;
        }

        while(x != 0)
        {
            iDigit = x % 10;
            rev = rev * 10 + iDigit;
            x = x / 10;
        }

        if(original == rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}