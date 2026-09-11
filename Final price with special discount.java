import java.util.*;

class Solution {
    public int[] finalPrices(int[] prices) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {

            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int index = stack.pop();

                prices[index] = prices[index] - prices[i];
            }

            stack.push(i);
        }

        return prices;
    }
}

Case 1:                  Case 2:

Input:                   Input:
prices = [8,4,6,2,3]     prices = [10,1,1,6]

Output:                  Output:
[4,2,4,2,3]              [9,0,1,6]

Expected:                Expected:
[4,2,4,2,3]              [9,0,1,6]