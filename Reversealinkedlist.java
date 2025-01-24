public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
    // Write your code here
    SinglyLinkedListNode prev=null;
    SinglyLinkedListNode current=llist;
    SinglyLinkedListNode next;
    while(current!=null){
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
    }
    return prev;
}
