import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class FindANodeInLinkedList {
    public static LinkedListNode<Integer> TackInput() {
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

    public static int findNode(LinkedListNode<Integer> head, int n) {
        int i = 0;
        while (head != null) {
            if (n == head.data) {
                return i;
            }
            head = head.next;
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        for (int i = 0; i < round; i++) {
            LinkedListNode<Integer> head = TackInput();
            int number = sc.nextInt();
            int index = findNode(head, number);
            System.out.println(index);
        }
    }
}
