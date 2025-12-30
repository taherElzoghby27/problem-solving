/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.solving.linkedlist;

import java.util.Map;
import java.util.LinkedHashMap;

/**
 *
 * @author taherlinux
 */
public class CopyListwithRandomPointer {

    public static void main(String[] args) {

    }

    public ListNode copyRandomList(ListNode head) {
        Map<ListNode, ListNode> nodeMap = new LinkedHashMap<ListNode, ListNode>();
        for (ListNode curr = head; curr != null; curr = curr.next) {
            ListNode currCopy = createNodeInMap(nodeMap, curr);
            if (curr.next != null) {
                currCopy.next = createNodeInMap(nodeMap, curr.next);
            }
            if (curr.random != null) {
                currCopy.random = createNodeInMap(nodeMap, curr.random);
            }
        }
        return head == null ? null : nodeMap.get(head);
    }

    private static ListNode createNodeInMap(Map<ListNode, ListNode> map, ListNode key) {
        if (!map.containsKey(key)) {
            map.put(key, new ListNode(key.val));
        }
        return map.get(key);
    }
}
