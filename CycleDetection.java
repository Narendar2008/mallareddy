 static boolean hasCycle(SinglyLinkedListNode head) {
if(head==null || head.next==null){
    return false;
}
SinglyLinkedListNode slow=head;
SinglyLinkedListNode fast=head.next;
while(slow!=fast){
    if(fast==null || fast.next==null){
        return false;
    }
    slow=slow.next;
    fast=fast.next.next;// 2steps
}
return true;
