/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method

    if(head == null){
        return head;
    }
    if(position == 0){
        head = head.next;
        return head;
    }
    else{
        
        int count = 0;
        Node node = head;
        while(count+1 != position){
            node = node.next;
            count++;
        }
        node.next = node.next.next;
        
        return head;
    }
}

