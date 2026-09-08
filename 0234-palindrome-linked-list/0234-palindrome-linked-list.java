/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middle(head);
        ListNode headSecHalf = reverse(mid);
        ListNode temp = headSecHalf;
        //compare both halves
        while(head!=null && headSecHalf != null){
            if(head.val != headSecHalf.val){
                break;
            }
            head = head.next;
            headSecHalf = headSecHalf.next;
        }
        reverse(temp);
        return head == null || headSecHalf == null;
    }
    public ListNode reverse(ListNode head){
        if(head == null){
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;
        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
    public ListNode middle(ListNode head){
        ListNode s = head;
        ListNode f = head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
}