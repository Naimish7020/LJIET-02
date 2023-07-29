import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        next = null;
    }
}

public class TakeInpuFromUser {// time complexity n^2.

    public static Node<Integer> TakeInput() {
        Node<Integer> head = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            Node<Integer> n1 = new Node<Integer>(data);
            if (head == null) {
                head = n1;
            } else {
                Node<Integer> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = n1;
            }
            data = sc.nextInt();
        }
        return head;

    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = TakeInput();
        print(head);
    }
}
