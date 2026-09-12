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
    public static int countList(ListNode head){
        ListNode n=head;
        int count=0;
        while(n!=null){
            count++;
            n=n.next;
        }
        return count;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int m=countList(list1);
        int n=countList(list2);
        int[] arr= new int[m+n];
        ListNode n1=list1;
        ListNode n2=list2;
        int i=0;
        while(n1!=null && n2!=null){
            if(n1.val<n2.val){
                arr[i]=n1.val;
                i++;
                n1=n1.next;
            }else{
                arr[i]=n2.val;
                i++;
                n2=n2.next;
            }
        }
        while(n1!=null){
            arr[i]=n1.val;
            i++;
            n1=n1.next;
        }
        while(n2!=null){
            arr[i]=n2.val;
            i++;
            n2=n2.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for(int j=0;j<arr.length;j++){
            current.next = new ListNode(arr[j]);
            current = current.next;
        }
        ListNode head = dummy.next;
        return dummy.next;
    }
}