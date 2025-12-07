/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.solving.linkedlist;

/**
 *
 * @author tataa
 */
public class RemoveNthFromEnd {

    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {//3nth //1 2 3 4 5 6 7 8
        // Create a dummy node to handle edge case where head is removed
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer n+1 steps ahead to create the gap
        // We move n+1 steps so slow ends up BEFORE the node to delete
        for (int i = 0; i <= n; i++) {// 1 2 3 4 -> fast = 4
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {//f=5,s=2 - f=6,s=3 - f=7,s=4 - f=8,s=5
            //5 (6) 7 8 
            fast = fast.next;
            slow = slow.next;
        }

        // Now slow is right before the node to remove
        // Remove the nth node from end
        slow.next = slow.next.next;

        return dummy.next;
    }
}
