import java.io.*;
import java.util.*;

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Solution {

    public static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        // Step 1: Get the lengths of both lists
        int length1 = getLength(head1);
        int length2 = getLength(head2);

        // Step 2: Align the starting points
        while (length1 > length2) {
            head1 = head1.next;
            length1--;
        }
        while (length2 > length1) {
            head2 = head2.next;
            length2--;
        }

        // Step 3: Find the merge point
        while (head1 != head2) {
            head1 = head1.next;
            head2 = head2.next;
        }

        return head1.data; // The merge point's data
    }

    private static int getLength(SinglyLinkedListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases
        for (int i = 0; i < t; i++) {
            int mergeIndex = scanner.nextInt();

            // First list
            int n1 = scanner.nextInt();
            SinglyLinkedListNode head1 = new SinglyLinkedListNode(scanner.nextInt());
            SinglyLinkedListNode current1 = head1;
            for (int j = 1; j < n1; j++) {
                current1.next = new SinglyLinkedListNode(scanner.nextInt());
                current1 = current1.next;
            }

            // Second list
            int n2 = scanner.nextInt();
            SinglyLinkedListNode head2 = new SinglyLinkedListNode(scanner.nextInt());
            SinglyLinkedListNode current2 = head2;
            for (int j = 1; j < n2; j++) {
                current2.next = new SinglyLinkedListNode(scanner.nextInt());
                current2 = current2.next;
            }

            // Creating the merge point
            SinglyLinkedListNode mergeNode = head1;
            for (int j = 0; j < mergeIndex; j++) {
                mergeNode = mergeNode.next;
            }
            current2.next = mergeNode;

            // Output the result
            System.out.println(findMergeNode(head1, head2));
        }

        scanner.close();
    }
}
