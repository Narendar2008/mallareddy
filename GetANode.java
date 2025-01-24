public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
    // Write your code here
    SinglyLinkedListNode temp = llist;
    int count = 0;
    while(llist!=null){
        llist = llist.next;
        if(count<positionFromTail+1){
            count++;
        }else{
            temp = temp.next;
        }
    }
    return temp.data;

    
    }

    }
