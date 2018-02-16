/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode list=new ListNode(0);
        ListNode p = list;
           
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val) {
                list.next=l1;
                l1=l1.next;
            }
            else {
                list.next=l2;
                l2=l2.next;
            }
             list=list.next;
        }
        list.next=null;
        if(l1!=null) list.next=l1;
        if(l2!=null) list.next=l2;
        
        return p.next;
    }
}
