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
    public void reorderList(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        while(head != null) {
            list.add(head);
            head = head.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        if((list.size() - 1) / 2 == list.size() / 2) {
            for(int i = 0; i < list.size() / 2; i++) {
                curr.next = list.get(i);
                curr = curr.next;
                curr.next = list.get(list.size() - 1 - i);
                curr = curr.next;
            }
            curr.next = list.get(list.size() / 2);
            curr.next.next = null;
        } else {
            for(int i = 0; i < list.size() / 2; i++) {
                curr.next = list.get(i);
                curr = curr.next;
                curr.next = list.get(list.size() - 1 - i);
                curr = curr.next;
                if(i == list.size() / 2 - 1) {
                    curr.next = null;
                }
            }
        }
        head = dummy.next;
    }
}
