
import java.util.Scanner;

class Node {
    public int data;
    public Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class LengthOfInput {
    public static Node TackInput() {
        Node head = null;
        Node tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            Node n1 = new Node(data);
            if (head == null) {
                head = n1;
                tail = n1;
            } else {
                tail.next = n1;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node head = TackInput();
        int length = length(head);
        System.out.println(length);
    }
}
