import java.util.*;

public class Main {
		public static void main (String [] args)
		{
			ListNode l1 = new ListNode(212);
			ListNode l2 = new ListNode(312);
			System.out.print(addTwoNumbers(l1,l2).val);
		}
		public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
		 
		
		    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) 
		    {
		    	 ListNode dummy = new ListNode(0);
		    	 int carry = 0;
		    	 ListNode p = l1, q= l2, curr = dummy;
		    	 
		    	while(p!=null || q!= null) //Constantly updating x & y so need to check if list is empty
		    	{ 
			    	int x = (p==null) ? 0 : p.val;
			    	int y = (q==null) ? 0 : q.val;
			    	
			    	int sum = x+y+carry;
			    	
			    	carry = sum/10; // if 0, x+y is less than 10, vice versa
			    	
			    	curr.next = new ListNode(sum%10);
			    	curr=curr.next;
			    	
			    	if(p!=null)p = p.next;
			    	if(q!=null)q = q.next;
		    	}
		    	if(carry == 1) curr.next = new ListNode(carry);
		    	
		    	return dummy.next;
		    		
		    	
		    }
		
}


