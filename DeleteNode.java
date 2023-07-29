import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    LinkedListNode(T data) {
        this.data = data;
        next = null;
    }
}

public class DeleteNode {
    public static LinkedListNode<Integer> DeleteNode(LinkedListNode<Integer> head, int position) {
        if (position == 0) {
            head = head.next;
            return head;
        }
        LinkedListNode<Integer> temp = head;
        int i = 0;
        while (i < position - 1) {
            temp = temp.next;
            i++;
        }
        if (temp.next.next == null) {
            temp.next = null;
        } else {
            temp.next = temp.next.next;
        }
        return head;
    }

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

    public static void print(LinkedListNode<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = TakeInput();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position");
        int position = sc.nextInt();
        head = DeleteNode(head, position);
        print(head);
    }
}
