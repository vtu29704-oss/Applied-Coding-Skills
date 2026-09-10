class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy;

        while (true) {
            ListNode kth = groupPrev;

            for (int i = 0; i < k; i++) {
                kth = kth.next;

                if (kth == null) {
                    return dummy.next;
                }
            }

            ListNode groupNext = kth.next;

            ListNode prev = groupNext;
            ListNode curr = groupPrev.next;

            while (curr != groupNext) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            ListNode temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;
        }
    }
}

Case 1:                Case 2:

Input:                 Input:
head = [1,2,3,4,5]     head = [1,2,3,4,5]
k = 2                  k = 3

Output:                Output:
[2,1,4,3,5]            [3,2,1,4,5]

Expected:              Expected:
[2,1,4,3,5]            [3,2,1,4,5]

