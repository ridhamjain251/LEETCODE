/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode>list=new HashSet<>();
        ListNode temp=head;
        while(temp!=null){
            if(list.contains(temp)) return true;
            list.add(temp);
            temp=temp.next;

        }
        return false;
        
    }
}