import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class printRecursively {
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

    public static void print(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        print(head.next);
        System.out.print(head.data + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rounds = sc.nextInt();
        for (int i = 0; i < rounds; i++) {
            Node head = TackInput();
            print(head);
        }
    }
}
