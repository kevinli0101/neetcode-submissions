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

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode tempf = null;
        ListNode tempn = head.next;
        ListNode curr = head;
        while (tempn.next != null) {
            tempf = curr;
            curr = tempn;
            tempn = tempn.next;
            curr.next = tempf;
            if (tempf == head) {
                tempf.next = null;
            }
        }
        tempf = curr;
        curr = tempn;
        curr.next = tempf;
        if (tempf == head) {
            tempf.next = null;
        }
        return curr;
    }
}
