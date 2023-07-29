import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class MidPoint {
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

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }
        int i = 0;
        if (length % 2 != 0) {
            while (temp != null && i < length / 2) {
                temp = temp.next;
                i++;
            }
        } else {
            while (temp != null && i < (length / 2) - 1) {
                temp = temp.next;
                i++;
            }
        }
        return temp;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        for (int i = 0; i < round; i++) {
            LinkedListNode<Integer> head = TackInput();
            head = midPoint(head);
            System.out.println(head.data);
        }
    }
}
