class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int previousIndex = map.get(nums[i]);

                if (i - previousIndex <= k) {
                    return true;
                }
            }

            map.put(nums[i], i);
        }

        return false;
    }
}

Case 1:                   Case 2:

Input:                    Input:    
nums = [1,2,3,1]          nums = [1,2,3,1,2,3]
k = 3                     k = 2

Output:                   Output:
true                      false

Expected:                 Expected:
true                      false