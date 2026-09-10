class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            int current = nums[i];

            int leftCost = current * i - leftSum;

            int rightSum = totalSum - leftSum - current;
            int rightCost = rightSum - current * (n - i - 1);

            result[i] = leftCost + rightCost;
            
            leftSum += current;
        }

        return result;
    }
}

Case 1:               Case 2:

Input:                Input:
nums = [2,3,5]        nums = [1,4,6,8,10]

Output:               Output:
[4,3,5]               [24,15,13,15,21]               

Expected:             Expected:
[4,3,5]               [24,15,13,15,21]