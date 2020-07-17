package kujiale;

public class reverselinkedlist {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next =e;
        e.next =f;
        f.next = g;
        Node result = helper(a, 3);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }
    public static class Node{
        Node next = null;
        int val = 0;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node helper(Node node, int n){
             return reverse(node, n);
    }

    public static Node reverse(Node node, int n) {
        Node mark  = node;
        int count = n;
        Node prenode = null;
        Node temp = node;
        while(temp != null) {
            Node nextnode = temp.next;
            temp.next = prenode;
            prenode = temp;
            temp = nextnode;
            count--;
            if(count == 0) break;
        }
        if(count != 0) return mark;
        else {
            if(prenode == null) return null;
            mark.next = reverse(temp, n);
            return prenode;
        }
    }
}
