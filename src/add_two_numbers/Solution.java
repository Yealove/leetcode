package add_two_numbers;

import add_two_numbers.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    /**
     * 我的怪糟糟的代码
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        int p;
        ListNode result = new ListNode(sum % 10);
        ListNode node = result;

        l1 = l1.next;
        l2 = l2.next;

        while (l1 != null) {
            p = sum / 10;
            if (l2 == null) {
                sum = l1.val + p;
                node.next = new ListNode(sum % 10);
            } else {
                sum = l1.val + p + l2.val;
                node.next = new ListNode(sum % 10);
                l2 = l2.next;
            }

            l1 = l1.next;
            node = node.next;
        }

        while (l2 != null) {
            p = sum / 10;
            sum = l2.val + p;
            node.next = new ListNode(sum % 10);
            l2 = l2.next;
            node = node.next;
        }

        if (sum / 10 != 0) {
            node.next = new ListNode(sum / 10);
        }

        return result;
    }

    /**
     * 优美的代码
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return sentinel.next;
    }
}