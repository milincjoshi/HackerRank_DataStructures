/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 

    if(head == null){
        return 0;
    }
    else{
        Node node = head;
        int size = 0;
        while(node!= null){
            size++;
            node = node.next;
        }
        int count = 0;
        node = head;
        while(count+1 != (size-n)){
            node = node.next;
            count++;
        }
        return node.data;
    }

}
