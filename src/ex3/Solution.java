package ex3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        return Arrays.stream(lists).toList().stream().sorted().findFirst().get();
        //return lsi;
    }
}
