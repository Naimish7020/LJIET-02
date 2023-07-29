class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        next = null;
    }

}

public class LinkTwoNode {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<Integer>(100);
        Node<Integer> n2 = new Node<Integer>(200);
        n1.next = n2;
        System.out.println(n1.data);
        System.out.println(n1.next);
        System.out.println(n2);
        System.out.println(n2.data);
        System.out.println(n2.next);
    }
}
