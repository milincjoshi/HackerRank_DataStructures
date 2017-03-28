/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    
    Node nodeA = headA;
    Node nodeB = headB;
    
    while(nodeA!= null){
        while(nodeB!= null){
            if(nodeA.equals(nodeB)){
                return nodeA.data;
            }
            else{
                nodeB = nodeB.next;
            }
        }
        
        nodeA = nodeA.next;
        nodeB = headB;
    }

    return 0;
}
