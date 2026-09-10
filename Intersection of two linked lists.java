public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {
            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = headA;
            } else {
                p2 = p2.next;
            }
        }

        return p1;
    }
}

Case 1:			   Case 2:

Input:			   Input:
intersectVal = 8	   intersectVal = 0
listA = [4,1,8,4,5]	   listA = [2,6,4]
listB = [5,6,1,8,4,5]      listB = [1,5]
skipA = 2		   skipA = 3
skipB = 3		   skipB = 2

Output:			   Output:
Intersected at '8'	   No intersection

Expected:		   Expected:
Intersected at '8'	   No intersection