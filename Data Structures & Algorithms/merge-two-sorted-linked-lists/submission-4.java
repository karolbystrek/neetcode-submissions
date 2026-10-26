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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sortedList = new ListNode();
        ListNode sortedListhead = sortedList;
        ListNode head1 = list1;
        ListNode head2 = list2;

        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                sortedList.next = head1;
                sortedList = sortedList.next;
                head1 = head1.next;
            } else {
                sortedList.next = head2;
                sortedList = sortedList.next;
                head2 = head2.next;
            }
        }

        while (head1 != null) {
            sortedList.next = head1;
            sortedList = sortedList.next;
            head1 = head1.next;
        }

        while (head2 != null) {
            sortedList.next = head2;
            sortedList = sortedList.next;
            head2 = head2.next;
        }

        return sortedListhead.next;
    }
}