/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.solving.linkedlist;

/**
 *
 * @author taherlinux
 */
public class RemoveDuplicatesFromSortedList {
// Helper method to create a linked list from an array

    public static ListNode createList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    // Helper method to print a linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        System.out.print("[");

        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(",");
            }
            current = current.next;
        }

        System.out.println("]");
    }

    public static void main(String[] args) {
        // Test Case 1: [1,1,2]
        System.out.println("Test Case 1:");
        ListNode test1 = createList(new int[]{1, 1, 2});
        System.out.print("Input:  ");
        printList(test1);
        ListNode result1 = deleteDuplicates(test1);
        System.out.print("Output: ");
        printList(result1);
        System.out.println();

        // Test Case 2: [1,1,2,3,3]
        System.out.println("Test Case 2:");
        ListNode test2 = createList(new int[]{1, 1, 2, 3, 3});
        System.out.print("Input:  ");
        printList(test2);
        ListNode result2 = deleteDuplicates(test2);
        System.out.print("Output: ");
        printList(result2);
        System.out.println();

        // Test Case 3: Empty list
        System.out.println("Test Case 3:");
        ListNode test3 = createList(new int[]{});
        System.out.print("Input:  ");
        printList(test3);
        ListNode result3 = deleteDuplicates(test3);
        System.out.print("Output: ");
        printList(result3);
        System.out.println();

        // Test Case 4: All duplicates [1,1,1,1]
        System.out.println("Test Case 4:");
        ListNode test4 = createList(new int[]{1, 1, 1, 1});
        System.out.print("Input:  ");
        printList(test4);
        ListNode result4 = deleteDuplicates(test4);
        System.out.print("Output: ");
        printList(result4);
        System.out.println();

        // Test Case 5: No duplicates [1,2,3,4]
        System.out.println("Test Case 5:");
        ListNode test5 = createList(new int[]{1, 2, 3, 4});
        System.out.print("Input:  ");
        printList(test5);
        ListNode result5 = deleteDuplicates(test5);
        System.out.print("Output: ");
        printList(result5);
    }

    public static ListNode deleteDuplicates(ListNode head) {//1 1 2 3
        if (head == null) {
            return null;
        }
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
