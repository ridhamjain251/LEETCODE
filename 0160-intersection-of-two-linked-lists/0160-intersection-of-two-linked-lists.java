/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode r=headA;
        ListNode s=headB;
        int t1=0;
        int t2=0;
        while(r.next !=null){
            t1++;
            r=r.next;

        }
        while(s.next!=null){
            t2++;
            s=s.next;
        }
        r=headA;
        s=headB;
        if (t1 > t2) {
            for (int i = 0; i < t1 - t2; i++) {
                r = r.next;
            }
        } else {
            for (int i = 0; i < t2 - t1; i++) {
                s = s.next;
            }
        }

        
        while (r != s) {
            r = r.next;
            s = s.next;
        }

        return r;

        
    }
}