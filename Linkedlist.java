import java.util.*;

//Linkedlist implemnetation without collections
class Node {
    int val;
    Node next;

    Node(int x) {
        val = x;
        next = null;
    }
}

public class Linkedlist {
    public static void main(String[] args) {
        Node head = null;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node kl = null;
        while (n != 0) {
            Node newnode = new Node(sc.nextInt());
            if (head == null) {
                head = newnode;
                head.next = null;
            } else {
                newnode.next = head;
                head = newnode;
            }
            n--;
            kl = newnode;
        }
        while (kl != null) {
            System.out.println(kl.val);
            kl = kl.next;
        }
    }
}
