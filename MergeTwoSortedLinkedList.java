import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class MergeTwoSortedLinkedList {
    public static LinkedListNode<Integer> TackInput() {
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            LinkedListNode<Integer> n1 = new LinkedListNode<Integer>(data);
            if (head == null) {
                head = n1;
                tail = n1;
            } else {
                tail.next = n1;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1,
            LinkedListNode<Integer> head2) {
        LinkedListNode<Integer> t1 = head1, t2 = head2;
        LinkedListNode<Integer> head = null, tail = null;
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }
        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
        if (t1 != null) {
            tail.next = t1;
        } else {
            tail.next = t2;
        }
        return head;
    }

    public static void print(LinkedListNode<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rounds = s.nextInt();
        for (int i = 0; i < rounds; i++) {
            LinkedListNode<Integer> head1 = TackInput();
            LinkedListNode<Integer> head2 = TackInput();
            LinkedListNode<Integer> head = mergeTwoSortedLinkedLists(head1, head2);
            print(head);
        }
    }
}
