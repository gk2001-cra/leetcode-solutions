class Solution {
    public int missingNumber(int[] nums) {
        
        int iCnt = 0;
        int arr_sum = 0;
        int iMissing = 0;

        int n = nums.length;

        int total_sum = n * (n + 1) / 2;

        for(iCnt = 0; iCnt < nums.length; iCnt++)
        {
            arr_sum += nums[iCnt];
        }

        iMissing = total_sum - arr_sum;

        return iMissing;
    }
}