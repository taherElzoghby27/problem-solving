package problem.solving.linkedlist;

public class ReverseLinkedList {

    public static void main(String[] args) {
    }

    public static ListNode reverseList(ListNode head) {//1 2 3 4 5 
        ListNode prev = null;
        ListNode curr = head;//1

        while (curr != null) {
            // Save next node before we change the pointer
            ListNode nextTemp = curr.next;//2 
            curr.next = prev;//null
            prev = curr;//1
            curr = nextTemp;//2
        }

        return prev;
    }
}
