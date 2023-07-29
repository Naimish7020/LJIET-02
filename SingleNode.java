class Node<T> {
    T data;
    Node<T> next;

    Node(T data) // construtore
    {
        this.data = data;
        next = null;
    }
}

public class SingleNode {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<Integer>(10);
        System.out.println(n1.data);
        System.out.println(n1.next);
    }
}
