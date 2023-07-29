import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }

}

public class DeleteNodeRecursively {
    public static Node TackInput() {
        Node head = null, tail = null;
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

    public static Node DeleteNode(Node head, int position) {
        if (head == null) {
            return head;
        }
        if (position == 0) {
            return head.next;
        }
        head.next = DeleteNode(head.next, position - 1);
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
        int round = sc.nextInt();
        for (int i = 0; i < round; i++) {
            Node head = TackInput();
            System.out.println("Enter the position:");
            int position = sc.nextInt();
            head = DeleteNode(head, position);
            print(head);

        }
    }
}
