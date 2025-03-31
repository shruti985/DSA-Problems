//Problem:Linked List cycle
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(slow!=null && fast.next!=null && fast!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            return true;
        }
        return false;
        
    }
}
//TC:O(N)
//SC:O(1)

//Problem:Middle of the linked list
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
//TC:O(N)
//SC:O(1)
