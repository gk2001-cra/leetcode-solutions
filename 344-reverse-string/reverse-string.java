class Solution {
    public void reverseString(char[] s) {

        int iStart = 0;
        int iEnd = s.length - 1;

            while(iStart < iEnd)
            {
                char temp = s[iStart];
                s[iStart] = s[iEnd];
                s[iEnd] = temp;  

                iStart++;
                iEnd--;
            }   
    }
}