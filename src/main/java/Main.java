import enumm.ColorEnum;

import javax.annotation.processing.SupportedSourceVersion;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;



public class Main {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode head = listNode;
        int adder = 0;
        while(l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int result = val1 + val2 + adder;
            adder = adder == 0 ? 0 : adder-1;
            if (result >= 10) {
                adder++;
                result -= 10;
            }
            listNode.next = new ListNode(result);
            listNode = listNode.next;
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }
        return head.next;
    }

    public static void main(String[] args) {
//        int[] nums1 = {1,2,3,4,5,6,7};
//        System.out.println(Arrays.stream(threeSum(nums1, 9)).boxed().toList());
//        rotate(nums1, 2);
//        rotate(nums1, 3);
        List<Integer> a = new ArrayList<>();
        a.add(2);
        ColorEnum color = ColorEnum.RED;
        Collections.sort(a);
//        System.out.println(Arrays.stream(nums1).boxed().toList());
        System.out.println(a);
    }
}