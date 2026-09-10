class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> a.val - b.val
        );

        for (ListNode list : lists) {
            if (list != null) {
                pq.offer(list);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!pq.isEmpty()) {
            ListNode node = pq.poll();

            curr.next = node;
            curr = curr.next;

            if (node.next != null) {
                pq.offer(node.next);
            }
        }

        return dummy.next;
    }
}

Case 1:                                Case 2:

Input:                                 Input:
lists = [[1,4,5],[1,3,4],[2,6]]        lists = [[]]

Output:                                Output:
[1,1,2,3,4,4,5,6]                      []

Expected:                              Expected:
[1,1,2,3,4,4,5,6]                      []
