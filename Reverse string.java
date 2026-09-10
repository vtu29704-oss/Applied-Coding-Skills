class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}

Case 1:                      Case 2:

Input:                       Input:
s = ["h","e","l","l","o"]    s = ["h","e","l","l","o"]

Output:                      Output:
["o","l","l","e","h"]        ["o","l","l","e","h"]

Expected:                    Expected:
["o","l","l","e","h"]        ["o","l","l","e","h"]