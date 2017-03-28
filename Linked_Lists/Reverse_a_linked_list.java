/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {

    if(head == null){
        return head;
    }
    else{
        
        //get size
        Node node = head;
        int size=0;
        while(node != null){
            size++;
            node = node.next;
        }
        int[] arr = new int[size];
        
        int i=0;
        node = head;
       while(node != null){
           arr[i] = node.data; 
           node = node.next;
           i++;
        }
        
        Node newHead = new Node();
        newHead.data = arr[size-1];
        Node tempNode = newHead;
        for(int j = i-2;j>=0;j--){
            Node node_to_create = new Node();
            node_to_create.data = arr[j];
            tempNode.next = node_to_create;
            tempNode = node_to_create;
        }
        
         return newHead;
    }
     
}
