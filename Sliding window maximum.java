import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[nums.length - k + 1];
        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.pollFirst();

            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i])
                dq.pollLast();

            dq.offerLast(i);

            if (i >= k - 1)
                ans[j++] = nums[dq.peekFirst()];
        }

        return ans;
    }
}

Case 1:                        Case 2:

Input:                         Input:
nums = [1,3,-1,-3,5,3,6,7]     nums = [1]
k = 3                          k = 1

Output:                        Output:
[3,3,5,5,6,7]                  [1]

Expected:                      Expected:
[3,3,5,5,6,7]                  [1]