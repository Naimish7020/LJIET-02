import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class ReverseLLiterative {
    public static LinkedListNode<Integer> TakeInput() {
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();

        }
        return head;
    }

    public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> previous = null;
        LinkedListNode<Integer> temp;
        while (current != null) {
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;

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
            LinkedListNode<Integer> head = TakeInput();
            head = reverse_I(head);
            print(head);
        }
    }
}
