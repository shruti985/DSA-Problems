//Problem:Find length of loop
class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        Node slow=head;
        Node fast=head;
        int i=0;
        while(slow!=null && fast.next!=null && fast!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                i=1;
                break;
            }
        }
            Node temp=slow;
            slow=slow.next;
            if(i==0)
                return 0;
            while(slow!=temp){
                i++;
                slow=slow.next;
            }
        return i;
    }
}
//TC:O(N)
//SC:O(1)


//problem:Linked List is palindrome
class Solution {
    // Function to check whether the list is palindrome.
    static boolean isPalindrome(Node head) {
        // Your code here
        ArrayList <Integer> arr=new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            arr.add(temp.data);
            temp=temp.next;
        }
        int l=arr.size(),i=0;
        temp=head;
        while(i<=l/2){
            if(temp.data!=arr.get(l-1-i))
            return false;
            temp=temp.next;
            i++;
        }
        return true;       
    }
}
//TC:O(N)
//SC:O(N)
