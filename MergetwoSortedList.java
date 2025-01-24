import java.io.*;
import java.util.*;

class Solution {

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        public SinglyLinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        SinglyLinkedListNode head;

        public void insertNode(int data) {
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            if (this.head == null) {
                this.head = newNode;
            } else {
                SinglyLinkedListNode temp = this.head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        public void printList() {
            SinglyLinkedListNode temp = this.head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static SinglyLinkedListNode mergeLists(SinglyLinkedListNode headA, SinglyLinkedListNode headB) {
        if (headA == null) {
            return headB;
        }
        if (headB == null) {
            return headA;
        }

        SinglyLinkedListNode mergedHead;

        // Choose the smaller value as the new head
        if (headA.data <= headB.data) {
            mergedHead = headA;
            mergedHead.next = mergeLists(headA.next, headB);
        } else {
            mergedHead = headB;
            mergedHead.next = mergeLists(headA, headB.next);
        }

        return mergedHead;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            // First linked list
            int n1 = scanner.nextInt();
            SinglyLinkedList llist1 = new SinglyLinkedList();
            for (int i = 0; i < n1; i++) {
                llist1.insertNode(scanner.nextInt());
            }

            // Second linked list
            int n2 = scanner.nextInt();
            SinglyLinkedList llist2 = new SinglyLinkedList();
            for (int i = 0; i < n2; i++) {
                llist2.insertNode(scanner.nextInt());
            }

            // Merge the two lists
            SinglyLinkedListNode mergedHead = mergeLists(llist1.head, llist2.head);

            // Print the merged list
            SinglyLinkedList mergedList = new SinglyLinkedList();
            mergedList.head = mergedHead;
            mergedList.printList();
        }

        scanner.close();
    }
}
