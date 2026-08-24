public class Solution {
    public int lengthOfCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next!= null ){
            fast=fast.next.next;
            slow=slow.next;
            if(fast == slow){
                //calc len
                ListNode temp = slow;
                int len=0;
                do{
                    temp = temp.next;
                    len++;
                }while(temp!=slow);
                return len;
            }
        }
        return 0;
    }
    public ListNode detectCycle(ListNode head) {
        int length =0;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next!= null ){
            fast=fast.next.next;
            slow=slow.next;
            if(fast == slow){
                length = lengthOfCycle(slow);
                break;
            }
        }
        if(length==0){
            return null;
        }
        //find start node
        ListNode f = head;
        ListNode s = head;
        while(length >0){
            s=s.next;
            length--;
        }
        //keep moving both forward until we meet at cycle
        while(f!=s){
            f = f.next;
            s= s.next;
        }
        return s;
    }
}