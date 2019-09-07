/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        //if empty ListNode
        if (head == null || head.next == null)
            return head;
        
        //Start with first head which is odd
        //After first odd it is even
        //Store this even in evenstart as we will refernce the end of odd here at last
        ListNode odd=head, even=head.next , evenstart=head.next;
        
        //while next is not null
        while(even !=null && even.next!=null){
            //referncing current odd to next odd
            odd.next=even.next;
            //updating current odd
            odd=odd.next;
            //referencing current even to next even
            even.next=odd.next;
            //updating current even
            even=even.next;
        }
        
        //join odd listnodes to even listnodes
        odd.next=evenstart;
        
        // return head
        return head;
    }
}
