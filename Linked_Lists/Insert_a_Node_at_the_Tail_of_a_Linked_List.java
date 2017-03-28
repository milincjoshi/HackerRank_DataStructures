/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
  if(head == null){
      head = new Node();
      head.data = data;
  }
  else{
      Node node = head;
      while(node.next != null){
          node = node.next;
      }
      Node tail = new Node();
      tail.data = data;
      node.next=tail;
  }
  
  return head;
}
