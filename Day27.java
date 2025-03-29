//Delete in a doubly linked list
// https://bit.ly/3QlEoMx 
class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        Node curr=head;
        if(x==1){
            head.next.prev=null;
            return head.next;
        }
        
        while(x>2){
            curr=curr.next;
            x--;
        }
        Node del=curr.next;
        curr.next=del.next;
        if(del.next!=null)
        del.next.prev=curr;
        return head;
    }
}
//TC:O(n)
//SC:O(1)

//Reverse a doubly linked list
// https://bit.ly/3w6hUaa
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        DLLNode curr=head;
        DLLNode prev=null;
        if(head==null || head.next==null) return head;
        while(curr!=null){
            DLLNode nextnode=curr.next;
            curr.prev=nextnode;
            curr.next=prev;
            prev=curr;
            curr=nextnode;            
        }
        return prev;
    }
}
//TC:O(N)
//SC:O(1)
