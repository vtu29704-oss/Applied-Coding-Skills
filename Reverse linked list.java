class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }
}

Case 1:               Case 2:

Input:                Input:
head = [1,2,3,4,5]    []

Output:               Output:
[5,4,3,2,1]           []

Expected:             Expected:
[5,4,3,2,1]           []