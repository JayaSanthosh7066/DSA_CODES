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

public class InsertatLast {
    public static void main(String[] args) {
        Node head = null;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node kl = null, tear = null;
        while (n != 0) {
            Node newnode = new Node(sc.nextInt());
            if (head == null) {
                head = newnode;
                head.next = null;
                tear = head;
            } else {
                tear.next = newnode;
                newnode.next = null;
                tear = newnode;
            }
            n--;
        }
        kl = head;
        while (kl != null) {
            System.out.println(kl.val);
            kl = kl.next;
        }
        sc.close();
    }
}
