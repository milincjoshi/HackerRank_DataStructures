/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
   // You only need to complete this method. 
  
    if(head ==  null && position ==0){
        head = new Node();
        head.data = data;
        
        return head;
    }
    else{
        int count = 0;
        
        //insert new head
        if(position ==0){
            Node newNode = new Node();
            newNode.next = head;
            newNode.data = data;
            
            return newNode;
            
        } else{//insertin between
            Node node = head;
            while(count+1 != position){
                node = node.next;
                count++;
            }
            
            Node newNode = new Node();
            newNode.next = node.next;
            node.next = newNode;
            newNode.data = data;
            
            return head;
        }
        
        
        
    }
    
}
