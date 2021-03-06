package common;

import java.util.HashSet;
import java.util.Set;

public class ListNode {
    public int val;
    public ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ListNode)) {
            return false;
        }
        ListNode node2 = (ListNode) obj;
        if (node2.val != this.val) {
            return false;
        }
        if (this.next == null) {
            return node2.next == null;
        } else {
            return next.equals(node2.next);
        }

    }

    public String toString() {
        ListNode listNode = this;
        StringBuilder builder = new StringBuilder("{ ");
        Set<ListNode> set = new HashSet<>();
        while (listNode != null) {
            builder.append(listNode.val + ", ");
            if (set.contains(listNode)) {
                builder.append("..., ");
                break;
            } else {
                set.add(listNode);
            }
            listNode = listNode.next;
        }
        builder.delete(builder.lastIndexOf(", "), builder.length());
        return builder.append(" }").toString();
    }

    public static ListNode create(int... array) {
        if (array == null || array.length < 1) {
            return null;
        }
        ListNode list = new ListNode(array[0]);
        ListNode node = list;
        for (int i = 1; i < array.length; i++) {
            node.next = new ListNode(array[i]);
            node = node.next;
        }
        return list;
    }
}
