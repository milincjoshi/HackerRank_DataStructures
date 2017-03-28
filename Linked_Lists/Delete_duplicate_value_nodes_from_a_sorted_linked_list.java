/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 

    
   
        
        Node node = head;
        while(node != null && node.next!= null){
           if(node.next.data == node.data){
               node.next = node.next.next;
           }
           else{
             
               node = node.next;
           }
        }
        return head;
    
    
}
