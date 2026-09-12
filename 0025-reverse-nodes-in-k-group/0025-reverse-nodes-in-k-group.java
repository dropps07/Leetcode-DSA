class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupPrev = dummy;
        while(true){
            // Find kth node
            ListNode kth = groupPrev;
            for(int i = 0; i < k; i++){
                kth = kth.next;
                if(kth == null){
                    return dummy.next;
                }
            }
            ListNode groupNext = kth.next;
            // Reverse the group
            ListNode prev = groupNext;
            ListNode present = groupPrev.next;
            while(present != groupNext){
                ListNode next = present.next;
                present.next = prev;
                prev = present;
                present = next;
            }
            // Reconnect previous part
            ListNode temp = groupPrev.next;
            groupPrev.next = kth;
            // Move groupPrev to end of reversed group
            groupPrev = temp;
        }
    }
}