import java.util.Scanner;

import javax.swing.filechooser.FileFilter;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class reverseRecursively {

    public static LinkedListNode<Integer> TakeInput() {
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
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

    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListNode<Integer> finalhead = reverseLinkedListRec(head.next);
        LinkedListNode<Integer> temp = finalhead;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;
        return finalhead;
    }

    public static void print(LinkedListNode<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rounds = sc.nextInt();
        for (int i = 0; i < rounds; i++) {
            LinkedListNode<Integer> head = TakeInput();
            head = reverseLinkedListRec(head);
            print(head);
        }
    }
}
