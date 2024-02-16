import java.util.*;

class Node {
    int data;
    Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    public void insertNode(int x) {
        Node newnode = new Node(x);
        if (this.head == null) {
            head = newnode;
        } else {
            Node curr = this.head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newnode;
        }
    }

    public void showList() {
        Node curr = this.head;
        while (curr.next != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print(curr.data);
        System.out.println();
    }

    public void reverseList() {
        Node prevnode = null;
        Node current = head;
        Node nextnode = null;

        while (current != null) {
            nextnode = current.next;
            current.next = prevnode;
            prevnode = current;
            current = nextnode;
        }

        head = prevnode;
    }

}

public class LinkedListTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes :");
        int n = sc.nextInt();

        LinkedList l1 = new LinkedList();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + "th element in the Linked list : ");
            int x = sc.nextInt();
            l1.insertNode(x);
        }

        System.out.println("List before reversal");
        l1.showList();
        l1.reverseList();
        System.out.println("List after reversal");
        l1.showList();
        sc.close();
    }
}
