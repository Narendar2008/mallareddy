import java.util.*;
class Solution{
    static class SinglyLinkedListNode{
        int data;
        SinglyLinkedListNode next;
        public SinglyLinkedListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class SinglyLinkedList{
        SinglyLinkedListNode head;
        public void insertNode(int data){
            SinglyLinkedListNode newNode=new SinglyLinkedListNode(data);
            if(this.head==null){
                this.head=newNode;
            }
            else{
                SinglyLinkedListNode temp=this.head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newNode;
            }
        }
    }
    public static int compare_lists(SinglyLinkedListNode llist1,SinglyLinkedListNode llist2){
        while(llist1!=null && llist2!=null){
            if(llist1.data!=llist2.data){
                return 0;
            }
            llist1=llist1.next;
            llist2=llist2.next;
        }
        return (llist1==null && llist2==null)? 1:0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int testCases=sc.nextInt();
        while(testCases-- >0){
            SinglyLinkedList llist1=new SinglyLinkedList();
            int n1=sc.nextInt();
            for(int i=0;i<n1;i++){
                llist1.insertNode(sc.nextInt());
            }
            SinglyLinkedList llist2=new SinglyLinkedList();
            int n2=sc.nextInt();
            for(int i=0;i<n2;i++){
                llist2.insertNode(sc.nextInt());
            }
            int result=compare_lists(llist1.head,llist2.head);
            System.out.println(result);
            
        }
    }
}
