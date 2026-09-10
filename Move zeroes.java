class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}

Case 1:                   Case 2:

Input:                    Input:
nums = [0,1,0,3,12]       nums = [0]

Output:                   Output:
[1,3,12,0,0]              [0]

Expected:                 Expected:
[1,3,12,0,0]              [0]