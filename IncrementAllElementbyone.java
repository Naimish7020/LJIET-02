import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        next = null;
    }
}

public class IncrementAllElementbyone 
{
    public static void IncrementAllElementbyone(Node<Integer> head) 
    {
        Node<Integer> temp = head;
        while (temp != null) 
        {
            temp.data = temp.data + 1;
            temp = temp.next;

        }
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
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = TakeInput();
        IncrementAllElementbyone(head);
        print(head);
    }

}
