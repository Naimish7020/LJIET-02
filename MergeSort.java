import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
        next = null;
    }
}

public class MergeSort {
    public static LinkedListNode<Integer> TackInput() {
        LinkedListNode<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            LinkedListNode<Integer> n1 = new LinkedListNode<Integer>(data);
            if (head == null) {
                head = n1;
                tail = n1;
            } else {
                tail.next = n1;
                tail = tail.next;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static LinkedListNode<Integer> midpoint(LinkedListNode<Integer> head) {
        if (head == null) {
            return head;
        }
        LinkedListNode<Integer> fast = head;
        LinkedListNode<Integer> slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListNode<Integer> midpoint = midpoint(head);
        LinkedListNode<Integer> firsthalf = head;
        LinkedListNode<Integer> secondhalf = midpoint.next;
        midpoint.next = null;
        firsthalf = mergeSort(firsthalf);
        secondhalf = mergeSort(secondhalf);
        LinkedListNode<Integer> newhead1 = mergeTwoSortedLinkedLists(firsthalf, secondhalf);
        return newhead1;
    }

    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1,
            LinkedListNode<Integer> head2) {
        LinkedListNode<Integer> t1 = head1;
        LinkedListNode<Integer> t2 = head2;
        LinkedListNode<Integer> newhead = null, newtail = null;
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        if (t1.data <= t2.data) {
            newhead = t1;
            newtail = t1;
            t1 = t1.next;
        } else {
            newhead = t2;
            newtail = t2;
            t2 = t2.next;
        }
        while (t1 != null && t2 != null) {
            if (t1.data < t2.data) {
                newtail.next = t1;
                newtail = t1;
                t1 = t1.next;
            } else {
                newtail.next = t2;
                newtail = t2;
                t2 = t2.next;
            }
        }
        if (t1 != null) {
            newtail.next = t1;
        } else {
            newtail.next = t2;
        }
        return newhead;
    }

    public static void print(LinkedListNode<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rounds = sc.nextInt();
        for (int i = 0; i < rounds; i++) {
            LinkedListNode<Integer> head = TackInput();
            head = mergeSort(head);
            print(head);
        }
    }
}
