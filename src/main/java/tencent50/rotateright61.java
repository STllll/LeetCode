package tencent50;

public class rotateright61 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public ListNode rotateRight(ListNode head, int k) {
//        if(head == null) return null;
//        if(head.next == null || k == 0) return head;
//        int count = count(head);
//        k = k % count;
//        ListNode tail = new ListNode(head.val);
//           for(int i = 0; i < k; i++) {
//               ListNode currentNode = head;
//               tail = findTail(head);
//               ListNode lastnotone = findlast(currentNode);
//               lastnotone.next = null;
//               tail.next = currentNode;
//               head = tail;
//           }
//           return tail ;
//    }
//
//    public  ListNode findTail(ListNode head) {
//        while(head.next != null) {
//            head = head.next;
//        }
//        return head;
//    }
//
//    public ListNode findlast(ListNode head) {
//        ListNode lastnowone = head;
//        while(head.next != null) {
//            if (head.next.next == null) lastnowone = head;
//            head = head.next;
//        }
//        return lastnowone;
//    }
//
//    public int count(ListNode head) {
//        int count = 0;
//        while(head.next != null){
//            count++;
//            head = head.next;
//        }
//        return count;
//    }

// base cases
        if (head == null) return null;
        if (head.next == null) return head;

        // close the linked list into the ring
        ListNode old_tail = head;
        int n;
        for(n = 1; old_tail.next != null; n++)
            old_tail = old_tail.next;
        old_tail.next = head;

        // find new tail : (n - k % n - 1)th node
        // and new head : (n - k % n)th node
        ListNode new_tail = head;
        for (int i = 0; i < n - k % n - 1; i++)
            new_tail = new_tail.next;
        ListNode new_head = new_tail.next;

        // break the ring
        new_tail.next = null;

        return new_head;
    }
}
