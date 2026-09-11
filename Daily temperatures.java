import java.util.*;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int prev = stack.pop();
                result[prev] = i - prev;
            }

            stack.push(i);
        }

        return result;
    }
}

Case 1:                         Case 2:

Input:                          Input:
temperatures = [30,40,50,60]    temperatures = [30,60,90]

Output:                         Output:
[1,1,1,0]                       [1,1,0]

Expected:                       Expected:
[1,1,1,0]                       [1,1,0]