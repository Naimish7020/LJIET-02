import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }

}

public class InsertRecursively {
    public static Node TackInput() {
        Node head = null;
        Node tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            Node n1 = new Node(data);
            if (head == null) {
                head = n1;
                tail = n1;
            } else {
                tail.next = n1;
                tail = n1;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static Node Insert(Node head, int position, int element) {
        if (head == null) {
            return head;
        }
        if (position == 0) {
            Node n1 = new Node(element);
            n1.next = head;
            return n1;
        }
        head.next = Insert(head.next, position - 1, element);
        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rounds = sc.nextInt();
        for (int i = 0; i < rounds; i++) {
            Node head = TackInput();
            System.out.println("enter the position:");
            int position = sc.nextInt();
            System.out.println("enter the element:");
            int element = sc.nextInt();
            head = Insert(head, position, element);
            print(head);
        }
    }

}
