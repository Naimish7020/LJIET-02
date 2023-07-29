import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class Midpoint2 {
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

    public static LinkedListNode<Integer> midpoint(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = TackInput();
        LinkedListNode<Integer> mid = midpoint(head);
        System.out.println(mid.data);
    }
}
