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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        while(head != null && set.contains(head.val)) {
            head = head.next;
        }
        ListNode n=head;
        while(n!=null && n.next!=null){
            if(set.contains(n.next.val)) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
        return head;
    }
}