class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}

Case 1:                   Case 2:

Input:                    Input:
nums = [-1,0,3,5,9,12]    nums = [-1,0,3,5,9,12]
target = 9                target = 9

Output:                   Output:
4                         -1

Expected:                 Expected:
4                         -1