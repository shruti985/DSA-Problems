//Problem:https://leetcode.com/problems/remove-linked-list-elements/
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            head=head.next;
        }
        ListNode prev=head;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val==val){
                prev.next=curr.next;
                curr=prev.next;
            }
            else{
                prev=curr;
                curr=curr.next;
            }
        }
        return head;
    }
}
//TC:O(N)
//SC:O(1)

//Problem:https://leetcode.com/problems/add-two-numbers/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode temp1 = l1, temp2 = l2;
        ListNode result = new ListNode(0); 
        ListNode curr = result; 

        while (temp1 != null && temp2 != null) {
            int val = temp1.val + temp2.val + carry;
            carry = val / 10;
            ListNode newn = new ListNode(val % 10);
            curr.next = newn;
            curr = curr.next;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        while (temp1 != null) {
            int val = temp1.val + carry;
            carry = val / 10;
            ListNode newn = new ListNode(val % 10);
            curr.next = newn;
            curr = curr.next;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            int val = temp2.val + carry;
            carry = val / 10;
            ListNode newn = new ListNode(val % 10);
            curr.next = newn;
            curr = curr.next;
            temp2 = temp2.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return result.next; 
    }
}
