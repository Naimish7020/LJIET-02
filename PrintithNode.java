import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    LinkedListNode(T data) {
        this.data = data;
        next = null;
    }
}

public class PrintithNode {

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
                tail = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void printIthNode(LinkedListNode<Integer> head, int i) {
        if (head == null) {
            System.out.println(" ");
        }
        int count = 0;
        while (head != null && count < i) {
            head = head.next;
            count++;
        }
        System.out.println(head.data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        for (int i = 0; i < round; i++) {
            LinkedListNode<Integer> head = TakeInput();
            int index = sc.nextInt();
            printIthNode(head, index);
        }
    }
}
