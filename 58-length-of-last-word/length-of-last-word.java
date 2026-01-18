class Solution {
    public int lengthOfLastWord(String s) {
        
        char Arr[];
        int i = 0;
        int iCount = 0;

        Arr = s.toCharArray();

        for(i = s.length() - 1; i >= 0; i--)
        {
            if(Arr[i] == ' ' && iCount == 0)
            {
               continue;
            }

            if(Arr[i] == ' ' && iCount > 0)
            {
                break;
            }

            iCount++;
        }

        return iCount;
    }
}