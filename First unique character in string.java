class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}

Case 1:            Case 2:

Input:             Input:
s = "leetcode"     s = "loveleetcode"

Output:            Output:
0                  2

Expected:          Expected:
0                  2