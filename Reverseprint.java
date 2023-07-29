import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        next = null;
    }
}

public class Reverseprint {
    public static Node<Integer> TakeInput() {
        Node<Integer> head = null;
        Node<Integer> tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            Node<Integer> newNode = new Node<Integer>(data);
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

    public static void print(Node<Integer> head) {
        int length = 0;
        Node<Integer> ans = head;
        Node<Integer> temp = head;
        while (head != null) {
            head = head.next;
            length++;
        }
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < length - i; j++) {
                temp = temp.next;
            }
            System.out.print(temp.data + " ");
            temp = ans;
        }

    }

    public static void main(String[] args) {
        Node<Integer> head = TakeInput();
        print(head);

    }
}
