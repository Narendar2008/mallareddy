 public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
    // Write your code here
 if(llist==null || llist.next==null){
    return llist;
 }
 DoublyLinkedListNode current=llist;
 DoublyLinkedListNode temp=null;
 while(current!=null){
    temp=current.prev;
    current.prev=current.next;
    current.next=temp;
    current=current.prev;
 }
 if(temp!=null){
    llist=temp.prev;
 }
 return llist;
    }

}
