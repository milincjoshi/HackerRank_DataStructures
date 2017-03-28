/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {

    if(head == null){
        
    }
    else{
        Node node = head;
        while(node.next!=null){
            node = node.next;
            //System.out.print(node.data);    
        }
        Node newHead = node;
        //System.out.println("New head"+node.data);
        
        Node tempNode = newHead;
        
        while(node!= null){
            tempNode.next = node.prev;
            tempNode = tempNode.next;
            node = node.prev;
        }
        
        tempNode = newHead.next;
        node = newHead;
        while(tempNode!= null){
            tempNode.prev = node;
            tempNode = tempNode.next;
            node = node.next;
        }
        
        
        
        return newHead;
        
    }
    
    return null;
}
