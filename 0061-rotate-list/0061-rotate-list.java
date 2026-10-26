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
    public ListNode rotateRight(ListNode head, int k) {
      if (head == null || head.next == null || k == 0)
            return head;

        ListNode p = head;
        ListNode v = head;
        int c = 0;

        while (p != null) {
            c++;
            p = p.next;
        }

        p = head;
        k = k % c;

        if (k == 0)
            return head;

        for (int i = 0; i < k; i++) {
            p = p.next;
        }

        while (p.next != null) {
            p = p.next;
            v = v.next;
        }

        ListNode t = v.next;
        v.next = null;
        p.next = head;
        head = t;

        return head;
    }

}