class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

Case 1:                Case 2:

Input:                 Input:
head = [1,2,3,4,5]     head = [1,2,3,4,5,6]

Output:                Output:
[3,4,5]                [4,5,6]

Expected:              Expected:
[3,4,5]                [4,5,6]