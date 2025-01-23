
import java.util.*;

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    SinglyLinkedListNode head;

    public void printList() {
        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

public class Solution {

    public static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        // Create a new node with the given data
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        // If the list is empty, the new node becomes the head
        if (head == null) {
            return newNode;
        }

        // Traverse to the end of the list
        SinglyLinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Link the new node at the tail
        current.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the linked list
        int n = scanner.nextInt();

        SinglyLinkedList linkedList = new SinglyLinkedList();

        // Reading and inserting data into the linked list
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            linkedList.head = insertNodeAtTail(linkedList.head, data);
        }

        // Print the linked list
        linkedList.printList();

        scanner.close();
    }
}
