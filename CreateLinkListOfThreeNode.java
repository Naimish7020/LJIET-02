class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        next = null;
    }
}

public class CreateLinkListOfThreeNode {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        n1.next = n2;
        n2.next = n3;
        Node<Integer> Head = n1;
        while (Head != null) {
            System.out.print(Head.data + " ");
            Head = Head.next;
        }
    }
}
