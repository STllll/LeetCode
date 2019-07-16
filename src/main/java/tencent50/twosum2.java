package tencent50;

import lombok.val;

public class twosum2 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            this.val = x;
        }
    }
    public static void main(String[] args){
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode target = new ListNode(0);
        ListNode p = l1, q = l2, curr = target;
        int jinwei = 0;
        while(p != null || q != null) {
            int one = p == null? 0 : p.val;
            int two = l1 == null? 0 : q.val;
            int sum = one + two + jinwei ;
            int val = sum % 10;
            jinwei = sum / 10;
            curr.next = new ListNode(val);
            curr = curr.next;
            if(p != null )p = p.next;
            if(q != null) q = q.next;
        }
        if(jinwei > 0) {
            curr.next = new ListNode(jinwei);
        }
        return target.next;
    }
}
