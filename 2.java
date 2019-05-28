/**
 * 	执行用时 : 9 ms, 在Add Two Numbers的Java提交中击败了94.64% 的用户
 *	内存消耗 : 41.1 MB, 在Add Two Numbers的Java提交中击败了94.55% 的用户
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null,p = null,longnode = null;
        int len1 = 0,len2 = 0,longlen = 0,shortlen = 0;
        for(ListNode i = l1; i != null;i = i.next){
            len1++;
        }
        for(ListNode i = l2; i != null;i = i.next){
            len2++;
        }
        longlen = (len1 > len2)?len1:len2;
        shortlen = (len1 < len2)?len1:len2;
        longnode = (len1 > len2)?l1:l2;
        result = new ListNode(0);
        p = result;
        ListNode p1 = l1,p2 = l2;
    	boolean flag = false;			//杩涗綅鏍囧織
        for(int i = 0;i < shortlen;i++,p1 = p1.next,p2 = p2.next,longnode = longnode.next) {
        	int n = 0;
        	
        	n = p1.val + p2.val;
        	if(flag) { 
        		n++;
        		flag = false;
        	}
        	if(n >= 10) {
        		flag = true;
        		n -= 10;
        	}
        	p.val = n;
        	if(!(i == shortlen - 1 && ((longlen - shortlen) == 0))) {
        		p.next = new ListNode(0);
            	p = p.next;
        	}
        }
        for(int i = 0;i < longlen - shortlen;i++,longnode = longnode.next) {
        	int n = 0;
        	
        	n= longnode.val;
        	if(flag) { 
        		n++;
        		flag = false;
        	}
            if(n >= 10) {
        		flag = true;
        		n -= 10;
        	}
        	
        	p.val = n;
        	if(i != longlen - shortlen - 1) {
        		p.next = new ListNode(0);
        		p = p.next;
        	}
        }
        if(flag == true) {
        	p.next = new ListNode(1);
        }
        return result;
    }
}