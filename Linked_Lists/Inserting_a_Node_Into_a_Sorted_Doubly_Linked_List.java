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

Node SortedInsert(Node head,int data) {
  
    if(head ==  null){
        
        Node newHead = new Node();
        newHead.data = data;
        newHead.prev = null;
        newHead.next = null;
        
        return newHead;
    }
    if(head.next == null){
        if(head.data>=data){
            Node newHead = new Node();
            newHead.data = data;
            newHead.next = head;
            head.prev = newHead;
            
            return newHead;
        }
        else{
            Node newHead = new Node();
            newHead.data = data;
            head.next = newHead;
            newHead.prev = head;
            
            return head;
            
        }
    }
    else{
        
        Node node = head;
        while(node!= null && node.next!= null){
            //System.out.println(node.data);
            if(node.next.data >= data && node.data<=data){
               Node newNode = new Node();
               newNode.data = data;

               newNode.next = node.next;
               newNode.prev = node;
                
               node.next.prev = newNode;
               node.next = newNode;
                
                break;
                //return head;
            }
            else{
                node = node.next;   
            }
        }
        if(node!= null && node.next == null){
            Node newNode = new Node();
            newNode.data = data;
            node.next = newNode;
            newNode.prev = node;
            newNode.next = null;
        }
        
        return head;

    }

}
