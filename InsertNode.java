import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        next = null;
    }
}

public class InsertNode {
    public static Node<Integer> Insert(Node<Integer> head, int data, int position) {
        int i = 0;
        Node<Integer> newNode = new Node<Integer>(data);
        if (position == 0) {
            newNode.next = head;
            return newNode;
        }
        Node<Integer> temp = head;
        while (i < position - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

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
        while (head != null) {
            System.out.print(head.data + "");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = TakeInput();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data");
        int data = sc.nextInt();
        System.out.println("Enter position");
        int position = sc.nextInt();
        head = Insert(head, data, position);
        print(head);
    }
}
