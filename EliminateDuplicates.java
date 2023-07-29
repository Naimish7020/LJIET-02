import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class EliminateDuplicates {
    public static LinkedListNode<Integer> TackInput() {
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            LinkedListNode<Integer> n1 = new LinkedListNode<Integer>(data);
            if (head == null) {
                head = n1;
                tail = n1;
            } else {
                tail.next = n1;
                tail = tail.next;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head.next;
        LinkedListNode<Integer> temp1 = head;
        while (temp != null) {
            if (head.data == temp.data) {
                temp = temp.next;
            } else {
                head.next = temp;
                head = temp;
                temp = temp.next;
            }
        }
        return temp1;
    }

    public static void print(LinkedListNode<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int i = 0; i < testcase; i++) {
            LinkedListNode<Integer> head = TackInput();
            head = removeDuplicates(head);
            print(head);
        }
    }
}
