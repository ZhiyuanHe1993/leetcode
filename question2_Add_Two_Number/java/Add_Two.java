package question2_Add_Two_Number.java;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        int carry = 0;
        while(l1 != null || l2 !=null || carry != 0){
        	int n1 = l1 !=null ? l1.val : 0;
        	int n2 = l2 !=null ? l2.val : 0;
        	int sum = n1 + n2 + carry;
        	node.next = new ListNode(sum%10);
        	node = node.next;
        	carry = sum/10;
        	l1 = l1 != null ? l1.next : null;
        	l2 = l2 != null ? l2.next : null;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
    	int[] num1 = {2, 4, 3};
    	int[] num2 = {5, 6, 4};
    	ListNode a = ListNode.constructLinkedList(num1);
    	ListNode b = ListNode.constructLinkedList(num2);
    	ListNode result = addTwoNumbers(a, b);
    	System.out.println(result.tolist());
    }
}