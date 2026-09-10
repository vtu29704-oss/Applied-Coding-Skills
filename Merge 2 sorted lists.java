class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;
        }

        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        return dummy.next;
    }
}

Case 1:              Case 2:

Input:               Input:
list1 = [1,2,4]      list1 = []
list2 = [1,3,4]      list2 = []

Output:              Output:
[1,1,2,3,4,4]        []

Expected:            Expected:
[1,1,2,3,4,4]        []