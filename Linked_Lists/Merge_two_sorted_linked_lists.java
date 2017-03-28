/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    
    if(headA == null && headB == null){
        
    }
    if(headA==null){
        return headB;
    }
    if(headB == null){
        return headA;
    }
    
    Node nodeA,nodeB,node;
    nodeA = headA;
    nodeB = headB;
    Node newHead;
    
    if(headA.data>headB.data){
        newHead = headB;
        nodeB = nodeB.next;
    }
    else{
        newHead = headA;
        nodeA = nodeA.next;
    }
    node = newHead;
    while(nodeA != null && nodeB != null){
        //System.out.println("comparing "+nodeA.data+" "+nodeB.data);
        if(nodeA.data>nodeB.data){
            node.next = nodeB;
            nodeB = nodeB.next;
            node = node.next;
        }
        else{
            node.next = nodeA;
            nodeA = nodeA.next;
            node = node.next;
        }
        
    }
    if(nodeA != null && nodeB == null){
        node.next = nodeA;
    }
    if(nodeA == null && nodeB != null){
        node.next = nodeB;
    }
        
    return newHead;
    
    
}
