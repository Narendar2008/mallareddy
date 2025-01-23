 SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

    // If inserting at the head of the list
    if (position == 0) {
        newNode.next = llist;
        return newNode;
    }

    // Traverse the list using a for loop to find the node just before the desired position
    SinglyLinkedListNode current = llist;
    for (int i = 0; i < position - 1; i++) {
        current = current.next;
    }

    // Insert the new node
    newNode.next = current.next;
    current.next = newNode;

    return llist; // Return the head of the list
