import java.util.*;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int j = 0;

        for (int x : pushed) {
            st.push(x);

            while (!st.isEmpty() && j < popped.length && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
        }

        return st.isEmpty();
    }
}

Case 1:                 Case 2:

Input:                  Input:
pushed = [1,2,3,4,5]    pushed = [1,2,3,4,5]
popped = [4,5,3,2,1]    popped = [4,3,5,1,2]

Output:                 Output:
true                    false

Expected:               Expected:
true                    false