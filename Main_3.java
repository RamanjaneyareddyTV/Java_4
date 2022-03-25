package ENDOFBASICS1;

public class Main_3 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(7);
        list1.next.next.next = new ListNode(9);
        list1.next.next.next.next = new ListNode(13);
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(40);
        ListNode head = mergeTwoLists(list1, list2);
		System.out.print("Merge Two Sorted ListsT:\n");
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode mlist = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                mlist.next = new ListNode(list1.val);
                mlist = mlist.next;
                list1 = list1.next;
            } else {
                mlist.next = new ListNode(list2.val);
                mlist = mlist.next;
                list2 = list2.next;
            }
        }
        while (list1 != null) {
            mlist.next = new ListNode(list1.val);
            mlist = mlist.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            mlist.next = new ListNode(list2.val);
            mlist = mlist.next;
            list2 = list2.next;
        }

        head = head.next;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
