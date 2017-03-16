package algorithms.add_two_numbers;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * <简单描述>
 * Created by Yealove on 2017-03-15.
 */
public class SolutionTest {

    /**
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     *
     * @throws Exception
     */
    @Test
    public void addTwoNumbers() throws Exception {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode listNode = new Solution().addTwoNumbers(l1, l2);
        assertEquals(7, listNode.val);
        assertEquals(0, listNode.next.val);
        assertEquals(8, listNode.next.next.val);

        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(5);

        ListNode listNode1 = new Solution().addTwoNumbers(l3, l4);
        assertEquals(0, listNode1.val);
        assertEquals(1, listNode1.next.val);

        ListNode l5 = new ListNode(1);
        l5.next = new ListNode(8);
        ListNode l6 = new ListNode(0);

        ListNode list = new Solution().addTwoNumbers(l5, l6);
        assertEquals(1, list.val);
        assertEquals(8, list.next.val);

        ListNode l7 = new ListNode(9);
        l7.next = new ListNode(9);
        ListNode l8 = new ListNode(1);

        ListNode list2 = new Solution().addTwoNumbers(l8, l7);
        assertEquals(0, list2.val);
        assertEquals(0, list2.next.val);
        assertEquals(1, list2.next.next.val);
    }

}