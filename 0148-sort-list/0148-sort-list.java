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
    public ListNode sortList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode n=head;
        ArrayList<Integer> list=new ArrayList<>();

        while(n!=null){
            int value=n.val;
            list.add(value);
            n=n.next;
        }
        Collections.sort(list);
        n=head;
        int i=0;
        while(n!=null){
            n.val=list.get(i++);
            n=n.next;
        }

        return head;
    }
}