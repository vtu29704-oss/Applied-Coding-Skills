class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }
}

Case 1:                   Case 2:

Input:                    Input:
nums = [1,2,3,4]          nums = [1,1,1,1,1]

Output:                   Output:
[1,3,6,10]                [1,2,3,4,5]

Expected:                 Expected:
[1,3,6,10]                [1,2,3,4,5]