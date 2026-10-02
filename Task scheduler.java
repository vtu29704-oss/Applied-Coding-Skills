import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        for (char task : tasks) {
            freq[task - 'A']++;
        }

        PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int count : freq) {
            if (count > 0) {
                maxHeap.offer(count);
            }
        }

        int time = 0;

        while (!maxHeap.isEmpty()) {

            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i <= n; i++) {

                if (!maxHeap.isEmpty()) {
                    int count = maxHeap.poll();

                    count--;

                    if (count > 0) {
                        temp.add(count);
                    }
                }

                time++;

                if (maxHeap.isEmpty() && temp.isEmpty()) {
                    break;
                }
            }

            for (int count : temp) {
                maxHeap.offer(count);
            }
        }

        return time;
    }
}

Case 1:                                Case 2:

Input:                                 Input:
tasks = ["A","A","A","B","B","B"]      tasks = ["A","A","A", "B","B","B"]
n = 2                                  n = 3

Output:                                Output:
8                                      10

Expected:                              Expected:
8                                      10
