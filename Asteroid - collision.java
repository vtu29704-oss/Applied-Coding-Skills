import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {

            boolean destroyed = false;

            while (!stack.isEmpty() &&
                   stack.peek() > 0 &&
                   asteroid < 0) {

                if (stack.peek() < -asteroid) {
                    stack.pop();
                }
                else if (stack.peek() == -asteroid) {
                    stack.pop();
                    destroyed = true;
                    break;
                }
                else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }

        return result;
    }
}

Case 1:                     Case 2:

Input:                      Input:

asteroids = [5,10,-5]       asteroids = [5,10] 

Output:                     Output:
[5,10]                      []

Expected:                   Expected:
[5,10]                      []