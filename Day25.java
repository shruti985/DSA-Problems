//Problem:Delete node in a linked list
//https://leetcode.com/problems/delete-node-in-a-linked-list/description/
Approach:Assign value of next node to node to be deleted and then delete the next node.
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
        
    }
}
//TC:O(1)
//SC:O(1)

//Problem:Linked List insertion at end
//https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1
class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        Node temp=head;
        Node newnode=new Node(x);
        if(head==null)
        return newnode;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        return head;
        
    }
}
//TC:o(n)
//SC:O(1)
