package com.demo.no00;

import com.common.ListNode;

/**
 * 24. 两两交换链表中的节点
 */
public class No24 {
    public ListNode swapPairs(ListNode head) {
        //只剩下一个节点，直接返回
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        while (pre.next != null && pre.next.next != null) {
            ListNode temp = head.next.next;
            pre.next = head.next;
            head.next.next = head;
            head.next = temp;


            pre = head;
            head = head.next;

        }
        return dummyNode.next;

    }
}
