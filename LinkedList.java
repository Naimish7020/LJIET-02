class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        next = null;
    }
}

public class LinkedList {
    public static void print(Node<Integer> Head) {
        while (Head != null) {
            System.out.print(Head.data + " ");
            Head = Head.next;

        }
    }

    public static void main(String[] args) {
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        Node<Integer> Head = n1;
        while (Head != null) {
            System.out.print(Head.data + " ");
            Head = Head.next;
        }
        System.out.println("Second time:");
        while (Head != null) {
            System.out.print(Head.data + " ");
            Head = Head.next;
        }
        System.out.println("Third time:");
        print(n1);
    }
}
