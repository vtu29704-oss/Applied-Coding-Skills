import java.util.*;

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> max = new ArrayDeque<>();
        Deque<Integer> min = new ArrayDeque<>();

        int left = 0, ans = 0;

        for (int right = 0; right < nums.length; right++) {

            while (!max.isEmpty() && nums[max.peekLast()] < nums[right])
                max.pollLast();

            while (!min.isEmpty() && nums[min.peekLast()] > nums[right])
                min.pollLast();

            max.offerLast(right);
            min.offerLast(right);

            while (nums[max.peekFirst()] - nums[min.peekFirst()] > limit) {
                if (max.peekFirst() == left)
                    max.pollFirst();

                if (min.peekFirst() == left)
                    min.pollFirst();

                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}

Case 1:

Input:
nums = [8,2,4,7]
limit = 4

Output:
2

Expected:
2
