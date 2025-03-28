//Problem:Doubly linked list Insertion at given position
//https://www.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1
class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
        Node temp=head;
        int i=0;
        while(i<p){
            temp=temp.next;
            i++;
        }
        Node newnode=new Node(x);
        if(temp.next==null){
            newnode.next=null;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        newnode.prev=temp;
        return head;
    }
}
//TC:O(N)
//SC:O(1)

//Problem:Search in Linked List
//https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node temp=head;
        while(temp!=null){
            if(temp.data==key)
            return true;
            temp=temp.next;
        }
        return false;
    }
}
//TC:O(n)
//SC:O(1)
