package LinkedLists.Problems;

//Given the head of a singly linked list, reverse the list, and return the reversed list.


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

public class ReverseLinkedList {

    //Time Complexity: O(n) 
    //Space Complexity: O(1)
    public ListNode reverseListIterative(ListNode head) {

        //Initialize three pointers prev as NULL, curr as head and next as NULL.
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        //Iterate through the linked list.
        while (current != null) {
            //Before changing next of current, store next node
            next = current.next;
            // This is where actual reversing happens 
            current.next = prev;
            //Move prev and curr one step forward 
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    //Time Complexity: O(n) 
    //Space Complexity: O(1)
    public ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        //1.Divide the list in two parts - first node and rest of the linked list.
        /*2.Call reverse for the rest of the linked list: reverse the rest list and put
        the first element at the end */
        ListNode rest = reverseListRecursive(head.next);
        head.next.next = head;

        //3.Link rest to first.
        //4.Fix head pointer
        head.next = null;

        return rest;
    }
}


