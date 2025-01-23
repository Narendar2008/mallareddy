rite your code here
        if (llist == null) {
            return null;
        }

        // If the node to delete is the head
        if (position == 0) {
            return llist.next;
        }

        // Traverse the list to find the node just before the one to delete
        SinglyLinkedListNode current = llist;
        for (int i = 0; i < position - 1; i++) {
            if (current.next == null) {
                return llist; // Position is out of bounds
            }
            current = current.next;
        }

        // Remove the node by updating the `next` reference
        if (current.next != null) {
            current.next = current.next.next;
        }

        return llist; // Return the head of the updated list

    }
