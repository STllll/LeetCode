package swordToOffer;
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    public class jointwolinkedlist {
        public ListNode Merge(ListNode list1, ListNode list2) {
            if(list1 == null) return list2;
            if(list2 == null) return list1;
            ListNode newstart = null;
            ListNode mark = null;
            ListNode temp = null;
            while (list1 != null && list2 != null) {
                if(list1.val >= list2.val) {
                    temp = list2;
                    if(newstart == null) {
                        newstart = temp;
                        mark = newstart;
                    } else {
                        newstart.next = temp;
                        newstart = newstart.next;
                    }
                    list2 = list2.next;

                } else {
                    temp = list1;
                    if(newstart == null) {
                        newstart = temp;
                        mark = newstart;
                    } else {
                        newstart.next = temp;
                        newstart = newstart.next;
                    }
                    list1 = list1.next;
                }

            }
            while(list1 != null) {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }
            while(list2 != null) {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
            return mark;
        }
    }
}
