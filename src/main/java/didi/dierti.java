package didi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dierti {
    public static void main(String args[]) {
        Node nodea = new Node(1);
        Node nodeb = new Node(2);
        Node nodec = new Node(3);
        nodea.next = nodeb;
        nodec.next = nodeb;
        Node result = findSameNode(nodeb, nodec);
        System.out.print(result.val);
    }

    static class Node {
        Node next = null;
        int val = 0;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node findSameNode(Node node1, Node node2) {
        int length1 = length(node1);
        int length2 = length(node2);
        if (length1 < length2) {
            Node temp = node1;
            node1 = node2;
            node2 = temp;
        }
        for (int i = 0; i < Math.abs(length1 - length2); i++) {
            node1 = node1.next;
        }
        while (node1 != null || node2 != null) {
            if (node1.val == node2.val) return node1;
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1;
    }

    public static int length(Node node) {
        int count = 0;
        while(node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

}
